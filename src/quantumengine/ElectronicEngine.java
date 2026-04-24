package quantumengine;

public class ElectronicEngine implements Engine {
    private boolean isRunning;
    private int speed;

    @Override
    public String getType() {
        return "Electronic Engine";
    }

    @Override
    public boolean start() {
        if (isRunning) {
            System.out.println("Electronic engine is already running.");
            return false;
        }
        isRunning = true;
        speed = 0;
        System.out.println("Electronic engine started.");
        return true;
    }

    @Override
    public boolean stop() {
        if (!isRunning) {
            System.out.println("Electronic engine is already stopped.");
            return false;
        }
        if(speed > 0) {
            System.out.println("Electronic engine can't be stopped at speed " + speed + " km/h.");
            return false;
        }
        isRunning = false;
        System.out.println("Electronic engine stopped.");
        return true;
    }

    @Override
    public void increase() {
        speed++;
    }

    @Override
    public void decrease() {
        speed--;
    }

    @Override
    public void onChangeSpeed(int carSpeed) {
        if(speed == carSpeed)
            return;
        if(speed < carSpeed) {
            while (speed < carSpeed) increase();
            System.out.println("Electronic engine internal speed accelerated to " + speed + " km/h.");
        } else {
            while (speed > carSpeed) decrease();
            System.out.println("Electronic engine internal speed slowed down to " + speed + " km/h.");
        }
    }

    @Override
    public boolean isRunning() {
        return isRunning;
    }
}

package quantumengine;

public class GasolineEngine implements Engine {
    private final int MAX_SPEED = 200;
    private boolean isRunning;
    private int speed;

    @Override
    public String getType() {
        return "Gasoline Engine";
    }

    @Override
    public void start() {
        if (isRunning) {
            System.out.println("Gasoline engine is already running.");
            return;
        }
        isRunning = true;
        speed = 0;
        System.out.println("Gasoline engine started.");
    }

    @Override
    public void stop() {
        if (!isRunning) {
            System.out.println("Gasoline engine is already stopped.");
            return;
        }
        if(speed > 0) {
            System.out.println("Gasoline engine can't be stopped at speed " + speed + " km/h.");
            return;
        }
        isRunning = false;
        System.out.println("Gasoline engine stopped.");
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
            System.out.println("Gasoline engine internal speed accelerated to " + speed + " km/h.");
        } else {
            while (speed > carSpeed) decrease();
            System.out.println("Gasoline engine internal speed slowed down to " + speed + " km/h.");
        }
    }

    @Override
    public boolean isRunning() {
        return isRunning;
    }
}

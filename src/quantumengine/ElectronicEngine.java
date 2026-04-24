package quantumengine;

public class ElectronicEngine implements Engine {
    private final int MAX_SPEED = 200;
    private boolean isRunning;
    private int speed;

    @Override
    public String getType() {
        return "Electronic Engine";
    }

    public void start() {
        if (isRunning) {
            System.out.println("Electronic engine is already running.");
            return;
        }
        isRunning = true;
        speed = 0;
        System.out.println("Electronic engine started.");
    }

    @Override
    public void stop() {
        if (!isRunning) {
            System.out.println("Electronic engine is already stopped.");
            return;
        }
        if(speed > 0) {
            System.out.println("Electronic engine can't be stopped at speed " + speed + "km/h.");
            return;
        }
        isRunning = false;
        System.out.println("Electronic engine stopped.");
    }

    @Override
    public void changeSpeed(int value) {
        if (!isRunning) {
            System.out.println("Start the car first.");
            return;
        }
        speed = Math.max(0, Math.min(MAX_SPEED, speed + value));
        if(speed == 200)
            System.out.println("Electronic engine is already at maximum speed (200 km/h).");
        else if(speed == 0)
            System.out.println("Electronic engine is already at 0 km/h.");
        else {
            String operation = (value > 0) ? "accelerated" : "slowed";
            System.out.println("Electric engine " + operation + " to " + speed + " km/h.");
        }
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public boolean isRunning() {
        return isRunning;
    }
}

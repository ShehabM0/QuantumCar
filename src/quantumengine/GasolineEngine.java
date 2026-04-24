package quantumengine;

public class GasolineEngine implements Engine {
    private final int MAX_SPEED = 200;
    private final int SPEED_STEP = 1;
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
    public void changeSpeed(int value) {
        if (!isRunning) {
            System.out.println("Start the car first.");
            return;
        }
        speed = Math.max(0, Math.min(MAX_SPEED, speed + value));
        int newSpeed = Math.max(0, Math.min(MAX_SPEED, speed + value));
        if(newSpeed == speed) {
            if(speed == MAX_SPEED)
                System.out.println("Gasoline engine is already at maximum speed (200 km/h).");
            else // speed == 0
                System.out.println("Gasoline engine is already at 0 km/h.");
        }
        else {
            speed = newSpeed;
            String operation = (value > 0) ? "accelerated" : "slowed";
            System.out.println("Gasoline engine " + operation + " to " + speed + " km/h.");
        }
    }

    @Override
    public void increase() {
        changeSpeed(SPEED_STEP);
    }

    @Override
    public void decrease() {
        changeSpeed(-SPEED_STEP);
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

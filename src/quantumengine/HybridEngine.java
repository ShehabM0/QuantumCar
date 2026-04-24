package quantumengine;

public class HybridEngine implements Engine {
    private final ElectronicEngine electronicEngine;
    private final GasolineEngine gasolineEngine;
    private final int SWITCH_SPEED = 50;
    private Engine activeEngine;
    private boolean isRunning;
    private int speed;

    public HybridEngine() {
        this.electronicEngine = new ElectronicEngine();
        this.gasolineEngine = new GasolineEngine();
        this.activeEngine = electronicEngine;
    }

    @Override
    public String getType() {
        return "Hybrid Engine running (" + activeEngine.getType() + ")";
    }

    @Override
    public boolean start() {
        if (isRunning) {
            System.out.println(getType() + " already running.");
            return false;
        }
        activeEngine.start();
        isRunning = true;
        speed = 0;
        System.out.println(getType() + " started.");
        return true;
    }

    @Override
    public boolean stop() {
        if (!isRunning) {
            System.out.println(getType() + " is already stopped.");
            return false;
        }
        if(speed > 0) {
            System.out.println(getType() + " can't be stopped at speed " + speed + " km/h.");
            return false;
        }
        activeEngine.stop();
        isRunning = false;
        System.out.println(getType() + " stopped.");
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
        switchEngineIfNeeded(carSpeed);
        if(speed < carSpeed) {
            while (speed < carSpeed) increase();
            System.out.println(getType() + " internal speed accelerated to " + speed + " km/h.");
        } else {
            while (speed > carSpeed) decrease();
            System.out.println(getType() + " internal speed slowed down to " + speed + " km/h.");
        }
    }

    private void switchEngineIfNeeded(int newSpeed) {
        Engine newEngine = newSpeed < SWITCH_SPEED ? electronicEngine : gasolineEngine;
        if(newEngine == activeEngine)
            return;

        boolean activeEngineStopped = activeEngine.stop();
        if(!activeEngineStopped) {
            System.out.println("hybrid engine failed to switch.");
            return;
        }

        boolean newEngineStarted = newEngine.start();
        if(!newEngineStarted) {
            System.out.println("hybrid engine failed to switch.");
            return;
        }

        String oldEngineType = activeEngine.getType();
        activeEngine = newEngine;
        System.out.println(
            "Hybrid Engine switched from " + oldEngineType +
            " to " + newEngine.getType() + "."
        );
    }

    @Override
    public boolean isRunning() {
        return isRunning;
    }
}

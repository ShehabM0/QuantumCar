package quantumengine;

// TODO
public class HybridEngine implements Engine {
    private final ElectronicEngine electricEngine;
    private final GasolineEngine gasEngine;
    private final int MAX_SPEED = 200;
    private final int SPEED_STEP = 1;
    private Engine activeEngine;
    private boolean isRunning;

    public HybridEngine() {
        this.electricEngine = new ElectronicEngine();
        this.gasEngine = new GasolineEngine();
        this.activeEngine = electricEngine;
    }

    @Override
    public String getType() {
        return "Hybrid Engine running (" + activeEngine.getType() + ").";
    }

    public void start() {
        return;
    }

    @Override
    public void stop() {
        return;
    }

    @Override
    public void changeSpeed(int value) {
        return;
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
        return activeEngine.getSpeed();
    }

    @Override
    public boolean isRunning() {
        return isRunning;
    }
}

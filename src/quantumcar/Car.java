package quantumcar;

import quantumengine.*;

public class Car {
    private final int SPEED_STEP = 20;
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void accelerate() {
        engine.changeSpeed(SPEED_STEP);
    }

    public void brake() {
        engine.changeSpeed(-SPEED_STEP);
    }

    public void increaseSpeed() {
        engine.increase();
    }

    public void decreaseSpeed() {
        engine.decrease();
    }

    public void replaceEngine(Engine engine) {
        String engineType = this.engine.getType();
        String targetEngineType = engine.getType();
        if(engineType.equals(targetEngineType))
            System.out.println("Car is already on " + engineType + ".");
        else {
            boolean engineIsRunning = this.engine.isRunning();
            if (!engineIsRunning) {
                this.engine = engine;
                System.out.println("Car engine has been replaced to " + targetEngineType + ".");
            } else
                System.out.println("Stop the car before replacing the engine.");
        }
    }

    public String getEngineType() {
        return engine.getType();
    }
}

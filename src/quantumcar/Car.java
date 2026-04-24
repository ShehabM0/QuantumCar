package quantumcar;

import quantumengine.*;

public class Car {
    private final int MAX_SPEED = 200;
    private final int SPEED_STEP = 20;
    private Engine engine;
    private int speed;

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
        if (!engine.isRunning()) {
            System.out.println("Start the car first.");
            return;
        }

        if (speed + SPEED_STEP <= MAX_SPEED) {
            speed += SPEED_STEP;
            System.out.println("Car accelerated to " + speed + " km/h.");
        } else {
            speed = MAX_SPEED;
            System.out.println("Car is already at maximum speed (" + MAX_SPEED + " km/h).");
        }
        engine.onChangeSpeed(speed);
    }

    public void brake() {
        if (!engine.isRunning()) {
            System.out.println("Car is not running.");
            return;
        }

        if (speed - SPEED_STEP >= 0) {
            speed -= SPEED_STEP;
            System.out.println("Car slowed down to " + speed + " km/h.");
        } else {
            speed = 0;
            System.out.println("Car is already at 0 km/h.");
        }
        engine.onChangeSpeed(speed);
    }

    public String getEngineType() {
        return engine.getType();
    }

    public int getSpeed() {
        return speed;
    }

    // package scope
    void replaceEngine(Engine engine) {
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
}

package quantumcar;

import quantumengine.*;

public class CarFactory {
    public static Car createCar(EngineType type) {
        Engine engine = createEngine(type);
        return new Car(engine);
    }

    public static void replaceEngine(Car car, EngineType type) {
        Engine engine = createEngine(type);
        car.replaceEngine(engine);
    }

    private static Engine createEngine(EngineType type) {
        if (type == EngineType.GASOLINE)
            return new GasolineEngine();
        if (type == EngineType.ELECTRONIC)
            return new ElectronicEngine();
        if (type == EngineType.HYBRID)
            return new HybridEngine();
        else
            throw new IllegalArgumentException("Invalid engine type.");
    }
}
import quantumengine.*;
import quantumcar.*;

public class Main {
    public static void main(String[] args) {
        Car car = CarFactory.createCar(EngineType.GASOLINE);
        Engine engine = new GasolineEngine();
        CarFactory.replaceEngine(car, EngineType.ELECTRONIC);

        car.start();
        car.increaseSpeed();
        car.stop();
        car.increaseSpeed();
        CarFactory.replaceEngine(car, EngineType.GASOLINE);
        car.brake();
        CarFactory.replaceEngine(car, EngineType.GASOLINE);
        car.stop();
        CarFactory.replaceEngine(car, EngineType.GASOLINE);
        car.brake();
        car.start();
        car.accelerate();
        car.decreaseSpeed();
        car.brake();
        car.decreaseSpeed();
        car.start();
        CarFactory.replaceEngine(car, EngineType.GASOLINE);
    }
}

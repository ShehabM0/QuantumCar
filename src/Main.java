import quantumengine.*;
import quantumcar.*;

public class Main {
    public static void main(String[] args) {
        Car car = CarFactory.createCar(EngineType.GASOLINE);
        Engine engine = new GasolineEngine();
        // car.replaceEngine(engine); // [x] outside package
        CarFactory.replaceEngine(car, EngineType.ELECTRONIC);
        car.start();
    }
}
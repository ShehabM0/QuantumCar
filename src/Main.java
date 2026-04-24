import quantumengine.*;
import quantumcar.*;

public class Main {
    public static void main(String[] args) {
        Car car = CarFactory.createCar(EngineType.GASOLINE);
        car.start();
        car.accelerate();
        car.accelerate();
        car.brake();
        car.brake();
        car.stop();
        CarFactory.replaceEngine(car, EngineType.ELECTRONIC);
        car.start();
        car.accelerate();
        car.brake();
        car.brake();
        CarFactory.replaceEngine(car, EngineType.GASOLINE);
        car.stop();
    }
}

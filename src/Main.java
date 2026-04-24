import quantumengine.*;
import quantumcar.*;

public class Main {
    public static void main(String[] args) {
        Car car = CarFactory.createCar(EngineType.HYBRID);
        car.start();
        car.start();
        car.accelerate();
        car.accelerate();
        car.stop();
        car.accelerate();
        car.brake();
        car.brake();
        car.start();
        car.brake();
        car.stop();

        System.out.println("----------");

        CarFactory.replaceEngine(car, EngineType.GASOLINE);
        car.start();
        car.accelerate();
        car.accelerate();
        car.brake();
        car.brake();
        car.stop();

        System.out.println("----------");

        CarFactory.replaceEngine(car, EngineType.ELECTRONIC);
        car.start();
        car.accelerate();
        car.brake();
        car.stop();
        car.accelerate();
        car.stop();
        car.brake();
    }
}

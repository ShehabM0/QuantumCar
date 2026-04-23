public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Car car = new Car(new ElectronicEngine());
        car.brake();
        car.accelerate();

        car.start();
        car.start();
        car.accelerate();
        car.replaceEngine(new GasolineEngine());
        car.accelerate();
        car.start();
        car.accelerate();
        car.accelerate();
        car.brake();
        car.stop();
        car.replaceEngine(new ElectronicEngine());
        car.accelerate();
        car.stop();
    }
}
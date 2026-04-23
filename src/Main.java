public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Car car = new Car(new GasolineEngine());
        car.replaceEngine(new GasolineEngine());

        car.replaceEngine(new GasolineEngine());
        car.replaceEngine(new ElectronicEngine());
        car.replaceEngine(new ElectronicEngine());
        car.replaceEngine(new HybridEngine());
    }
}
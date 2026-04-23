public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Car gasolineCar = new Car(new GasolineEngine());
        gasolineCar.getEngineType();

        Car electronicCar = new Car(new ElectronicEngine());
        electronicCar.getEngineType();

        Car hybridCar = new Car(new HybridEngine());
        hybridCar.getEngineType();
    }
}
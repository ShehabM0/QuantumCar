public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void getEngineType() {
        System.out.println(engine.getType());
    }
}

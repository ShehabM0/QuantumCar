public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void replaceEngine(Engine engine) {
        String engineType = this.engine.getType();
        String targetEngineType = engine.getType();
        if(engineType.equals(targetEngineType))
            System.out.println("Car is already on " + engineType);
        else {
            this.engine = engine;
            System.out.println("Car engine has been switched to " + engineType);
        }
    }

    public void getEngineType() {
        System.out.println(engine.getType());
    }
}

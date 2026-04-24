package quantumengine;

public interface Engine {
    boolean isRunning();
    String getType();

    void onChangeSpeed(int value);
    void increase();
    void decrease();

    void start();
    void stop();
}

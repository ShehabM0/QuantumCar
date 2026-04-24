package quantumengine;

public interface Engine {
    boolean isRunning();
    String getType();

    void onChangeSpeed(int value);
    void increase();
    void decrease();

    boolean start();
    boolean stop();
}

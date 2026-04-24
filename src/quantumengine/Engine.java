package quantumengine;

public interface Engine {
    String getType();
    boolean isRunning();
    int getSpeed();

    void changeSpeed(int value);
    void increase();
    void decrease();

    void start();
    void stop();
}

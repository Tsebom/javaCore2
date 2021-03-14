package ru.geekbrains.javaCore2.nezhdanovsv;

public class Treadmill extends Obstacle{
    private static final String TYPE_OBSTACLE = "Беговая дорожка";
    private final int runDistance;

    public Treadmill(int runDistance) {
        super(TYPE_OBSTACLE);
        this.runDistance = runDistance;
    }

    @Override
    public boolean overObstacle(ActiveMotion o) {
        return o.run() >= runDistance;
    }
}
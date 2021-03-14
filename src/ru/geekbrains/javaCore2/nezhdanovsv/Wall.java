package ru.geekbrains.javaCore2.nezhdanovsv;

public class Wall extends Obstacle{
    private static final String TYPE_OBSTACLE = "Стенка";
    private final int wallHeight;

    public Wall(int wallHeight) {
        super(TYPE_OBSTACLE);
        this.wallHeight = wallHeight;
    }

    @Override
    public boolean overObstacle(ActiveMotion o) {
        return o.jump() >= wallHeight;
    }
}

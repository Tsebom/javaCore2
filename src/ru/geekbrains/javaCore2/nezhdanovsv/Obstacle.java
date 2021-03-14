package ru.geekbrains.javaCore2.nezhdanovsv;

public abstract class Obstacle {
    protected String typeObstacle;

    public Obstacle(String typeObstacle) {
        this.typeObstacle = typeObstacle;
    }

    public abstract boolean overObstacle(ActiveMotion o);
}

package ru.geekbrains.javaCore2.nezhdanovsv;

public abstract class Unit {
    protected String name;
    protected int jumpMax;
    protected int runMax;

    public Unit(String name, int jumpMax, int runMax) {
        this.name = name;
        this.jumpMax = jumpMax;
        this.runMax = runMax;
    }

    public String getName() {
        return name;
    }
}

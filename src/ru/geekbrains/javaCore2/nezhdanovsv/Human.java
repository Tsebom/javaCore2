package ru.geekbrains.javaCore2.nezhdanovsv;

public class Human extends Unit implements ActiveMotion{

    public Human(String name, int jumpMax, int runMax) {
        super(name, jumpMax, runMax);
    }

    @Override
    public int run() {
        return runMax;
    }

    @Override
    public int jump() {
        return jumpMax;
    }
}

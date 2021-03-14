package ru.geekbrains.javaCore2.nezhdanovsv;

public class Cat extends Unit implements ActiveMotion{

    public Cat(String name, int jumpMax, int runMax) {
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

package ru.geekbrains.javaCore2.nezhdanovsv;

/**
 * Homework1
 * @author Nezhdanov Serei
 * @version 1.0
 */

public class Homework1 {

    public static void main(String[] args) {
        Obstacle[] obstacles = {
                new Treadmill(100),
                new Wall(10)
        };

        ActiveMotion[] units = {
                new Human("Vova", 15, 10),
                new Cat("Boris", 1,105),
                new Robot("Wally", 15, 110)
        };

        for (ActiveMotion unit : units) {
            System.out.println(((Unit)unit).getName() + " на старте:");
            for (Obstacle obstacle : obstacles) {
                if (!obstacle.overObstacle(unit)) {
                    System.out.println(((Unit)unit).getName() + " не преодалел припятствие " + "\"" +
                            obstacle.typeObstacle + "\"" + " и сходит с дистанции.");
                    break;
                }
                System.out.println(((Unit)unit).getName() + " преодалел припятствие " + "\"" +
                        obstacle.typeObstacle + "\".");
            }
        }
    }
}

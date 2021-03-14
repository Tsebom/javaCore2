package ru.geekbrains.javaCore2.nezhdanovsv;

/**
 * Homework1
 * @author Nezhdanov Serei
 * @version 1.0
 */

public class DaOfWeekMain {
    public static void main(String[] args) {
        System.out.println("Solution one:");
        System.out.println(getWorkingHoursOnce(DayOfWeek.MONDAY));
        System.out.println(getWorkingHoursOnce(DayOfWeek.TUESDAY));
        System.out.println(getWorkingHoursOnce(DayOfWeek.WEDNESDAY));
        System.out.println(getWorkingHoursOnce(DayOfWeek.THURSDAY));
        System.out.println(getWorkingHoursOnce(DayOfWeek.FRIDAY));
        System.out.println(getWorkingHoursOnce(DayOfWeek.SATURDAY));
        System.out.println(getWorkingHoursOnce(DayOfWeek.SUNDAY));
        System.out.println("\nSolution two:");
        System.out.println(getWorkingHoursTwo(DayOfWeek.MONDAY));
        System.out.println(getWorkingHoursTwo(DayOfWeek.TUESDAY));
        System.out.println(getWorkingHoursTwo(DayOfWeek.WEDNESDAY));
        System.out.println(getWorkingHoursTwo(DayOfWeek.THURSDAY));
        System.out.println(getWorkingHoursTwo(DayOfWeek.FRIDAY));
        System.out.println(getWorkingHoursTwo(DayOfWeek.SATURDAY));
        System.out.println(getWorkingHoursTwo(DayOfWeek.SUNDAY));
    }

    enum DayOfWeek {
        MONDAY("40"),
        TUESDAY("32"),
        WEDNESDAY("24"),
        THURSDAY("16"),
        FRIDAY("8"),
        SATURDAY("Weekend"),
        SUNDAY("Weekend");

        private String hourLRemainder;

        DayOfWeek(String hourLRemainder) {
            this.hourLRemainder = hourLRemainder;
        }
    }

    public static String getWorkingHoursOnce(DayOfWeek d) {
        if (d.ordinal() < 5) {
            return Integer.toString(40 - d.ordinal() * 8);
        }
        else {
            return "Weekend";
        }
    }

    public static String getWorkingHoursTwo(DayOfWeek d) {
        return d.hourLRemainder;
    }
}

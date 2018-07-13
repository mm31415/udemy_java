package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(400, 4));
        System.out.println(getDurationString(400, 2334));
        System.out.println(getDurationString(345345));
        System.out.println(getDurationString(-234));

    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && (seconds >= 0 && seconds <= 59)) {
            return (minutes / 60) + "h " +
                    (minutes % 60) + "m " +
                    seconds + "s";
        }

        return "Invalid Value";
    }

    public static String getDurationString(int seconds) {
        if (seconds >= 0) {
            return getDurationString(seconds / 60, seconds % 60);
        }

        return "Invalid Value";
    }
}

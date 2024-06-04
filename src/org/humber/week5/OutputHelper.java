package org.humber.week5;

public final class OutputHelper {

    private OutputHelper() {}

    public static void print(String... strings) {
        for (String string : strings) {
            System.out.println(string);
        }
    }
}

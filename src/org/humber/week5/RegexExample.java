package org.humber.week5;

public class RegexExample {

    private final static String REGEX = "^[a-zA-Z0-9]+$";

    public static void main(String[] args) {

        String input = "HelloWorld123";
        System.out.println(input.matches(REGEX));
        String input2 = "HelloWorld1";
        System.out.println(input2.matches(REGEX));

        System.out.println(input2.substring(2,5));
    }

}

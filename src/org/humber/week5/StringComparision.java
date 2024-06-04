package org.humber.week5;

public class StringComparision {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = null;

        System.out.println("str1 == str2:" + (str1 == str2));
        System.out.println("str1 == str3: " + (str1 == str3));
        System.out.println("str1.equals(str3): " + str1.equals(str3));


        String str4 = str1.concat(" World");
        System.out.println(str4);
    }

}

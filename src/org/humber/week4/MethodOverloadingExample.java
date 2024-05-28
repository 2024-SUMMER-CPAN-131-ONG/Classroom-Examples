package org.humber.week4;


class Addition {

    public int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloadingExample {


    public static void main(String[] args) {
        Addition addition = new Addition();
        System.out.println(addition.add(1, 2));
        System.out.println(addition.add(1, 2, 3, 4, 5, 6, 7,8,9,10,11,12,13,14,15,16,17,18,19,20));
        System.out.println(addition.add(1.5, 2.5));
    }

}

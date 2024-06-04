package org.humber.week5;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorialRecursive(3));
    }

    public static int factorial(int n) {
        if(n == 0) {
            return 1;
        }
        int fact = 1;
        while(n-- > 1) {
            fact *= n;
        }
        return fact;
    }


    public static int factorialRecursive(int n) {
        if(n == 0) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }
    // 3 * 2 * 1 * 1
}

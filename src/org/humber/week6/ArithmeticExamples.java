package org.humber.week6;

public class ArithmeticExamples {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {2, 3, 4, 5, 6};

        int[] multiplication = new int[5];

        for(int index = 0; index < multiplication.length; index++) {
            System.out.println("Multiplication: " + multiplication[index]);
        }
    }

    //Assume that the arrays are of the same length
    public static int[] crossMultiply(int[] array1, int[] array2) {
        int[] multiplication = new int[array1.length];
        //TODO Implement the logic to cross multiply the elements of the two arrays
        return multiplication;
    }

}

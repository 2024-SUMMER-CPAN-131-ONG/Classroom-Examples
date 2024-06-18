package org.humber.week7;

public class MatrixSumExample {

    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2},
                {3, 4}
        };

        int[][] matrix2 = {
                {5, 6},
                {7, 8}
        };

        System.out.println("Matrix 1");
        ArrayPrinter.printArray(matrix1);
        System.out.println("Matrix 2");
        ArrayPrinter.printArray(matrix2);


        int[][] result = addMatrices(matrix1, matrix2);

        System.out.println("Matrix 1 + Matrix 2");
        ArrayPrinter.printArray(result);
    }

    //Assuming square matrices
    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix1.length];
        for(int row = 0; row < matrix1.length; row++) {
            for(int col = 0; col < matrix1.length; col++) {
                result[row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }
        return result;
    }


}

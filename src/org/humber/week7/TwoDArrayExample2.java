package org.humber.week7;

import java.util.Scanner;

public class TwoDArrayExample2 {

    public static void main(String[] args) {

        int[][] matrix;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        matrix = new int[rows][columns];

        for(int row = 0; row < matrix.length; row++) {
            for(int column = 0; column < matrix[row].length; column++) {
                System.out.print("Enter the value for row " + row + " and column " + column + ": ");
                matrix[row][column] = scanner.nextInt();
            }
        }

        ArrayPrinter.printArray(matrix);


    }

}

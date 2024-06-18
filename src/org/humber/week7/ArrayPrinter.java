package org.humber.week7;

public final class ArrayPrinter {

    private ArrayPrinter() {
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void printArray(int[][] array) {
        for (int rows = 0; rows < array.length; rows++) {
            for (int columns = 0; columns < array[rows].length; columns++) {
                System.out.printf("array[%d][%d] value: %d \n", rows, columns, array[rows][columns]);
            }
            System.out.println();
        }
    }

}

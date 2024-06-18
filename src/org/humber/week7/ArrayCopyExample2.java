package org.humber.week7;

public class ArrayCopyExample2 {



    public static void main(String[] args) {
        int[] source = {1, 2, 3, 4, 5};
        // source[0] - 1
        // source[1] - 2
        // source[2] - 3
        int[] destination = new int[10];

        System.arraycopy(source, 2, destination, 6, 3);

        for (int index = 0; index < destination.length; index++) {
            System.out.println("Index " + index + " value:" + destination[index]);
        }
    }
}

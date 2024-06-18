package org.humber.week7;

public class ArrayCopyExample1 {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5}; // 0 - 4

        int[] arr2 = new int[10]; // 0 - 9

        for(int index = 0 ; index < arr1.length; index++) {
            arr2[index] = arr1[index];
        }

        for(int index = 0; index < arr2.length; index++) {
            System.out.println("Index " + index + " value:" + arr2[index]);
        }
    }

}

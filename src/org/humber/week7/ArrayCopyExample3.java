package org.humber.week7;

import java.util.Arrays;

public class ArrayCopyExample3 {

    public static void main(String[] args) {
        int[] sourceArray = {2, 3, 1, 5, 10};

        int[] destination = Arrays.copyOf(sourceArray, sourceArray.length);

        for (int index = 0; index < destination.length; index++) {
            System.out.println("Index " + index + " value:" + destination[index]);
        }



    }
}

package org.humber.week6;

import java.util.ArrayList;
import java.util.Scanner;

public class SentinelExample {

    public static void main(String[] args) {
        int[] numbers = new int[100];
        ArrayList<Integer> numbersList = new ArrayList<>(100);

        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        int index = 0;
        do {
            System.out.print("Enter any number & -1 to exit: ");
            userInput = scanner.nextInt();
            numbers[index++] = userInput;
            numbersList.add(userInput);
        } while (userInput != -1);

        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            if(numbers[i] == -1) {
                break;
            }
        }

        for(Integer each : numbersList) {
            System.out.println(each);
        }
    }

}

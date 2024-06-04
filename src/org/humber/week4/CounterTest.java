package org.humber.week4;

class Counter {
    private static int count = 0;

    public Counter() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}
public class CounterTest {
    public static void main(String[] args) {
        int count = 10;
        while(count-- > 0) {
            new Counter(); // Create a new Counter object
        }

        System.out.println("Total Count: " + Counter.getCount()); // Should print 2
    }
}

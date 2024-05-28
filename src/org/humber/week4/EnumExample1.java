package org.humber.week4;


public class EnumExample1 {


    public static void main(String[] args) {
        System.out.println("Shape is: " + (Shape.valueOf("CIRCLE") == Shape.CIRCLE));
        System.out.println("Shape is: " + Shape.SQUARE);
        System.out.println("Shape is: " + Shape.TRIANGLE);

        for(Shape shape : Shape.values()) {
            System.out.println("Shape is: " + shape);
        }
    }

}

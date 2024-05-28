package org.humber.week4;


class Circle {
    public static final double PI = 3.14159;
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
}

public class FinalVariableExample {


    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Area of circle with radius "
                + circle.getRadius() + " : " + circle.area());

        System.out.println("PI Value: " + Circle.PI);

    }
}

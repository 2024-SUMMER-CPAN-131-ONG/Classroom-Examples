package org.humber.week2;

import org.humber.week2.Circle;

import java.util.Scanner;

public class CircleExample {
    public static void main(String[] args) {
        Circle circle = Circle.createCircle(1);
        Scanner scanner = new Scanner(System.in);
        circle.setRadius(scanner.nextDouble());
        System.out.println("Enter the radius of the circle: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
    }
}

package org.humber.week2;


public class Circle {

    private double radius;
    static final double PI = 3.14159565;

    private Circle(double radius) {
        this.radius = radius;
    }

    public static Circle createCircle(double radius) {
        if(radius > 0) {
            return new Circle(radius);
        }
        return null;
    }



    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return getPerimeter()/2 * radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}


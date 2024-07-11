package org.humber.week9;

class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return length * width;
    }
}


public class InheritanceExample {

    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5);
        System.out.println(circle.getArea());
        System.out.println(circle.getRadius());
        System.out.println(circle.getColor());

        Shape circleShape = (Shape) circle; //Legal

        Circle renovateShape = (Circle) circleShape;

        System.out.println(renovateShape.getRadius());
        System.out.println(renovateShape.getArea());
    }

}

package org.humber.week9;

class Vehicle {

    private String numberPlate;
    protected String color;

    public Vehicle(String numberPlate, String color) {
        this.numberPlate = numberPlate;
        this.color = color;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public String getColor() {
        return color;
    }
}

class Car extends Vehicle {

    private String model;

    public Car(String numberPlate, String color, String model) {
        super(numberPlate, color);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setColor(String color) {
        super.color = color;
    }

}

enum BusType {
    MINI, REGULAR, LUXURY
}

class Bus extends Vehicle {

    private BusType type;

    public Bus(String numberPlate, String color, BusType type) {
        super(numberPlate, color);
        this.type = type;
    }

    public BusType getType() {
        return type;
    }
}


public class HierarchicalInheritanceExample {

    public static void main(String[] args) {
        Car car = new Car("ABC123", "Red", "Toyota");
        Bus bus = new Bus("XYZ456", "Blue", BusType.REGULAR);

        System.out.println("Car");
        System.out.println("Number Plate: " + car.getNumberPlate());
        System.out.println("Color: " + car.getColor());
        System.out.println("Model: " + car.getModel());

        System.out.println("Change Color for Car to Blue");
        car.setColor("Blue");
        System.out.println("Color: " + car.getColor());


        System.out.println("Bus");
        System.out.println("Number Plate: " + bus.getNumberPlate());
        System.out.println("Color: " + bus.getColor());
        System.out.println("Type: " + bus.getType());
    }

}

package org.humber.week9;

class Contact {
    protected String contact;

    public Contact(String contact) {
        this.contact = contact;
    }

}

class Address extends Contact {
    private String street;
    private String city;

    public Address(String contact, String street, String city) {
        super(contact);
        this.street = street;
        this.city = city;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

class Student extends Address {

    private String name;

    public Student(String contact, String street, String city, String name) {
        super(contact, street, city);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setCity(String city) {
        super.setCity(city + ", ON");
    }
}

public class SingleInheritanceExample {

    public static void main(String[] args) {
        Student student = new Student("6478990001", "1234 James St", "Toronto", "John Doe");
        System.out.println(student.getName());
        System.out.println(student.getContact());
        System.out.println(student.getStreet());
        System.out.println(student.getCity());

        student.setCity("Brampton");

        System.out.println(student.getCity());

    }
}

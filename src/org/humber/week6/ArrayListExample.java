package org.humber.week6;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John", 20));
        students.add(new Student("Jane", 21));
        students.add(new Student("Jack", 22));
        students.add(new Student("Jill", 23));

        for (Student each : students) {
            System.out.println(each.getName() + " has " + each.getPercentage() + " Percent");
        }

    }

}

package org.humber.week6;

public class ParallelArraysExample {

    public static void main(String[] args) {
        String[] names = {"John", "Jane", "Jack", "Jill"};
        double[] percentages = {90.0, 80.0, 70.0, 60.0};

        for (int index = 0; index < names.length; index++) {
            System.out.println(names[index] + " scored " + percentages[index] + "%");
        }

        Student[] students = new Student[4];
        students[0] = new Student("John", 90.0);
        students[1] = new Student("Jane", 80.0);
        students[2] = new Student("Jack", 70.0);
        students[3] = new Student("Jill", 60.0);

        for(Student each: students) {
            System.out.println(each.getName() + " scored " + each.getPercentage() + "%");
        }

    }

}

class Student {

        private String name;
        private double percentage;

        public Student(String name, double percentage) {
            this.name = name;
            this.percentage = percentage;
        }

        public String getName() {
            return name;
        }

        public double getPercentage() {
            return percentage;
        }
}

package Collections;

import java.util.*;

class SetCustomObjectOperations {
    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();

        students.add(new Student(1, "Aayushi"));
        students.add(new Student(2, "Rahul"));
        students.add(new Student(1, "Aayushi")); // duplicate

        System.out.println("Student Set:");
        for (Student s : students) {
            System.out.println(s);
        }

        students.remove(new Student(2, "Rahul"));

        boolean found = students.contains(new Student(1, "Aayushi"));
        System.out.println("Student with ID 1 found? " + found);
    }
}

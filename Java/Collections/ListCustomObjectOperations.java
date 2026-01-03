package Collections;
import java.util.*;

class ListCustomObjectOperations {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Aayushi"));
        students.add(new Student(2, "Rahul"));
        students.add(new Student(3, "Neha"));

        System.out.println("Student List:");
        for (Student s : students) {
            System.out.println(s);
        }

        students.set(1, new Student(2, "Rohan"));

        students.remove(0);

        boolean found = false;
        for (Student s : students) {
            if (s.id == 3) {
                found = true;
                break;
            }
        }

        System.out.println("Student with ID 3 found? " + found);
        System.out.println(students);
    }
}

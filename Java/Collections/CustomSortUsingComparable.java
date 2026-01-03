package Collections;

import java.util.*;

class SortUsingComparable {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student(3, "Rahul"));
        list.add(new Student(1, "Aayushi"));
        list.add(new Student(2, "Neha"));

        Collections.sort(list);

        System.out.println(list);
    }
}

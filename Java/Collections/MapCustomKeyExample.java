package Collections;

import java.util.*;

class MapCustomKeyExample {
    public static void main(String[] args) {

        Map<Student, String> map = new HashMap<>();

        map.put(new Student(1, "Aayushi"), "Topper");
        map.put(new Student(2, "Rahul"), "Average");
        map.put(new Student(1, "Aayushi"), "Excellent"); // duplicate key but value gets updated

        for (Map.Entry<Student, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

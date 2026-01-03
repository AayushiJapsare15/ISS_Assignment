package Collections;

import java.util.*;

class NameComparator implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return s1.name.compareTo(s2.name);
    }
}


class SortUsingComparator {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student(3, "Rahul"));
        list.add(new Student(4, "Aayushi"));
        list.add(new Student(2, "Neha"));

        Collections.sort(list, new NameComparator());

        System.out.println(list);
    }
}

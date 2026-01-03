package Collections;

import java.util.Set;

class Student implements Comparable<Student>{
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
// Set works like this internally:
// Uses hashCode() to find bucket
// Uses equals() to check equality
    public boolean equals(Object o) {
        Student s = (Student) o;
        return id == s.id && name.equals(s.name);
    }

    public int hashCode() {
        return id;
    }

    public int compareTo(Student s) {
        return this.id - s.id;   // ascending order by id
    }

    public String toString() {
        return id + " " + name;
    }
}

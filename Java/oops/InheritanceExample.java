package oops;
class Person {
    String name;
    int age;

    void display() {
        System.out.println(name + " " + age);
    }
}

class Student extends Person {
    int marks;

    void show() {
        System.out.println(marks);
    }
}

class InheritanceExample {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Aayushi";
        s.age = 20;
        s.marks = 85;

        s.display();
        s.show();
    }
}

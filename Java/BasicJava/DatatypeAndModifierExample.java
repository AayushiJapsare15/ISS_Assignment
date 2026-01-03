package BasicJava;
public class DatatypeAndModifierExample {
    //datatypes
    int age = 21;
    double salary = 55000.75;
    float marks = 85.5f;
    char grade = 'A';
    boolean isEmployee = true;

    // Instance variable
    String name;

    // Static variable
    static String company = "ISS";

    void display() {
        // Local variable
        int id = 101;
        System.out.println(name + " works at " + company + ", ID: " + id);
    }

    //Access Modifiers
    public String fullName;
    protected int currentAge;
    private double balance;

    void showBalance() {
        System.out.println(balance);
    }

    //Non-Access Modifiers

    static int count = 0;
    final double PI = 3.14;

    static void increment() {
        count++;
    }

    public static void main(String[] args) {
        DatatypeAndModifierExample obj1 = new DatatypeAndModifierExample();

        obj1.name ="Ayushi";
        obj1.display();

        obj1.balance=12345;
        obj1.showBalance();

        increment();
        System.out.println(DatatypeAndModifierExample.count);

        
    }



}

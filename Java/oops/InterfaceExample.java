package oops;

// Methods are public abstract by default
//  Variables are public static final
// Cannot create object of interface
// Supports multiple inheritance
interface A {
    void showA();
}

interface B {
    void showB();
}

class InterfaceExample implements A, B {

    public void showA() {
        System.out.println("A method");
    }

    public void showB() {
        System.out.println("B method");
    }

    public static void main(String[] args) {
        InterfaceExample obj = new InterfaceExample();
        obj.showA();
        obj.showB();
    }
}


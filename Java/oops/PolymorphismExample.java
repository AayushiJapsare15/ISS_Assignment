package oops;
class Bank {
    double getInterestRate() {
        return 5.0;
    }

    //Compile-Time Polymorphism (Overloading)
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class SBI extends Bank {
    double getInterestRate() {
        return 6.5;
    }
}

class ICICI extends Bank {
    double getInterestRate() {
        return 7.0;
    }
}

class PolymorphismExample {
    public static void main(String[] args) {
        //runtime polymorphism - method overloading
        Bank b;

        // Reference decides accessibility
        // Object decides execution

        b = new SBI();
        System.out.println(b.getInterestRate());

        b = new ICICI();
        System.out.println(b.getInterestRate());

        System.out.println(b.add(1, 2));
        System.out.println(b.add(2.5,3.6));


        
        
    }
}

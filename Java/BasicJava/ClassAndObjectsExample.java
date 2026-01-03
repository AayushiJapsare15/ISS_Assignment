package BasicJava;
// BankAccountlass	Blueprint / design
// Object	Real thing created from the class
// State	Data of the object (instance variables)
// Methods	Actions the object can perform

class BankAccount {

    // STATE (Instance Variables)
    String accountHolderName;
    int accountNumber;
    double balance;

    // CONSTRUCTOR 
    BankAccount(String name, int accNo, double initialBalance) {
        accountHolderName = name;
        accountNumber = accNo;
        balance = initialBalance;
    }

    //  METHOD (Behavior) – Deposit money
    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    //  METHOD – Withdraw money
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // METHOD – Display account details
    void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance:" + balance);
    }
}

class ClassAndObjectsExample{
    public static void main(String[] args) {

        // OBJECT CREATION
        BankAccount acc1 = new BankAccount("Ayushi", 101, 5000);
        BankAccount acc2 = new BankAccount("Sneha", 102, 3000);

        // USING METHODS (Behavior)
        acc1.displayAccountDetails();
        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc1.displayAccountDetails();

        acc2.displayAccountDetails();
        acc2.withdraw(4000);  // insufficient balance case
        acc2.deposit(1500);
        acc2.displayAccountDetails();
    }

}



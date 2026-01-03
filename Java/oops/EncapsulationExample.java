package oops;

// private variables
// public getters & setters
// No direct data access

class Account {

    private double balance;

    public void setBalance(double amount) {
        if (amount > 0) {
            balance = amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

class EncapsulationExample {
    public static void main(String[] args) {
        Account a = new Account();
        a.setBalance(5000);
        System.out.println(a.getBalance());
    }
}


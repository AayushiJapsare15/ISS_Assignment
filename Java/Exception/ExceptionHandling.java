package Exception;

class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {

    private double balance = 5000;

    void withdraw(double amount) throws InsufficientBalanceException {

        if (amount <= 0) {
            throw new InsufficientBalanceException("Invalid withdrawal amount");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance");
        }

        balance -= amount;
        System.out.println("Withdrawal successful");
        System.out.println("Remaining balance: " + balance);
    }
}

class ExceptionHandling {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        try {
            acc.withdraw(7000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues normally");
    }
}


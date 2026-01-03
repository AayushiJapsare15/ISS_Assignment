package Multithreading;

class BankAccount {

    int balance = 1000;

    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing");
            balance = balance - amount;
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance for " + Thread.currentThread().getName());
        }
    }
}

class MyThread extends Thread {

    BankAccount account;

    MyThread(BankAccount account) {
        this.account = account;
    }

    public void run() {
        account.withdraw(700);
    }
}

class MultithreadingDemo {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        MyThread t1 = new MyThread(account);
        MyThread t2 = new MyThread(account);

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();
        t2.start();
    }
}

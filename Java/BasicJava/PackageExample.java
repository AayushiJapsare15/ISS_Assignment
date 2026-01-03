package BasicJava;

import oops.Account;

public class PackageExample {
    public static void main(String[] args) {

        Account acc = new Account();
        acc.setBalance(50000);
        System.out.println(acc.getBalance());
    }
}

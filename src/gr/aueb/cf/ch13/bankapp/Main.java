package gr.aueb.cf.ch13.bankapp;

import gr.aueb.cf.ch13.bankapp.model.OverdraftAccount;
import gr.aueb.cf.ch13.bankapp.model.JointAccount;

public class Main {
    public static void main(String[] args) {
        try {
            // OverdraftAccount
            OverdraftAccount overdraft = new OverdraftAccount(1, "GR1234567890", "John", "Doe", "123456789", 1000.0, 500.0);
            System.out.println(overdraft.accountToString());
            overdraft.deposit(500.0);
            System.out.println("Balance after deposit: " + overdraft.getAccountBalance());
            overdraft.withdraw(1200.0, "123456789");
            System.out.println("Balance after withdrawal: " + overdraft.getAccountBalance());
            overdraft.withdraw(400.0, "123456789");
            System.out.println("Balance after overdraft withdrawal: " + overdraft.getAccountBalance());

            // JointAccount
            JointAccount joint = new JointAccount(2, "GR0987654321", "Jane", "Doe", "987654321", "Alice", "Smith", "123123123", 2000.0);
            System.out.println(joint.accountToString());
            joint.deposit(1000.0);
            System.out.println("Balance after deposit: " + joint.getAccountBalance());
            joint.withdraw(1500.0, "987654321");
            System.out.println("Balance after withdrawal by first owner: " + joint.getAccountBalance());
            joint.withdraw(500.0, "123123123");
            System.out.println("Balance after withdrawal by second owner: " + joint.getAccountBalance());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

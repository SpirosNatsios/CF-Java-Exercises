package gr.aueb.cf.ch13.bankapp.model;

public class JointAccount {
    private int id;
    private String iban;
    private String firstname1;
    private String lastname1;
    private String ssn1;
    private String firstname2;
    private String lastname2;
    private String ssn2;
    private double balance;

    public JointAccount() {

    }

    public JointAccount(int id, String iban, String firstname1, String lastname1, String ssn1,
                        String firstname2, String lastname2, String ssn2, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname1 = firstname1;
        this.lastname1 = lastname1;
        this.ssn1 = ssn1;
        this.firstname2 = firstname2;
        this.lastname2 = lastname2;
        this.ssn2 = ssn2;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getFirstname1() {
        return firstname1;
    }

    public void setFirstname1(String firstname1) {
        this.firstname1 = firstname1;
    }

    public String getLastname1() {
        return lastname1;
    }

    public void setLastname1(String lastname1) {
        this.lastname1 = lastname1;
    }

    public String getSsn1() {
        return ssn1;
    }

    public void setSsn1(String ssn1) {
        this.ssn1 = ssn1;
    }

    public String getFirstname2() {
        return firstname2;
    }

    public void setFirstname2(String firstname2) {
        this.firstname2 = firstname2;
    }

    public String getLastname2() {
        return lastname2;
    }

    public void setLastname2(String lastname2) {
        this.lastname2 = lastname2;
    }

    public String getSsn2() {
        return ssn2;
    }

    public void setSsn2(String ssn2) {
        this.ssn2 = ssn2;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Public API

    /**
     * Deposits a certain amount of money in an
     * {@link JointAccount}.
     *
     * @param amount
     *          the amount of money to be deposited.
     * @throws Exception
     *          if the amount is negative.
     */
    public void deposit(double amount) throws Exception {
        try {
            if (amount <= 0) {
                throw new Exception("Negative Amount Exception");
            }
            balance += amount;
            System.out.println("Deposit of " + amount + " success.");
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Withdraws an amount of money from an {@link JointAccount}
     * based on a valid ssn.
     *
     * @param amount
     *          the amount of money to withdraw.
     * @param ssn
     *          the given ssn.
     * @throws Exception
     *          if the balance is insufficient or if
     *          the ssn is not valid.
     */
    public void withdraw(double amount, String ssn) throws Exception {
        try {
            if (!isSsnValid(ssn)) {
                throw new Exception("Ssn is not valid exception");
            }

            if (amount > balance) {
                throw new Exception("Insufficient balance");
            }

            balance -= amount;
            System.out.println("Withdraw of " + amount + " success.");
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Returns the balance of the {@link JointAccount}.
     *
     * @return
     *      the {@link JointAccount}'s balance.
     */
    public double getAccountBalance() {
        System.out.println("Return of account balance success");
        return getBalance();
    }

    /**
     * Return the {@link JointAccount} state in {@link String} format.
     *
     * @return
     *          the String-representation of the state of the {@link JointAccount}.
     */
    public String accountToString() {
        return "(" + id + ", " + iban + ", " + firstname1 + ", " + lastname1
                + ", " + ssn1 + ", " + firstname2 + ", " + lastname2
                + ", " + ssn2 + ", " + balance + ")";
    }

    private boolean isSsnValid(String ssn) {
        return this.ssn1.equals(ssn) || this.ssn2.equals(ssn);
    }
}

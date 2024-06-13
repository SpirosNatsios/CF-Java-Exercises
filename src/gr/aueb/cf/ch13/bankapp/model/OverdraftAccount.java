package gr.aueb.cf.ch13.bankapp.model;


public class OverdraftAccount {
    private int id;
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;
    private double overdraftLimit;

    public OverdraftAccount() {

    }

    public OverdraftAccount(int id, String iban, String firstname, String lastname, String ssn, double balance, double overdraftLimit) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
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

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    // Public API

    /**
     * Deposits a certain amount of money in an
     * {@link OverdraftAccount}.
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
     * Withdraws an amount of money from an {@link OverdraftAccount}
     * based on a valid ssn.
     *
     * @param amount
     *          the amount of money to withdraw.
     * @param ssn
     *          the given ssn.
     * @throws Exception
     *          if the balance and overdraft limit are insufficient or if
     *          the ssn is not valid.
     */
    public void withdraw(double amount, String ssn) throws Exception {
        try {
            if (!isSsnValid(ssn)) {
                throw new Exception("Ssn is not valid exception");
            }

            if (amount > (balance + overdraftLimit)) {
                throw new Exception("Insufficient balance and overdraft limit exceeded");
            }

            balance -= amount;
            System.out.println("Withdraw of " + amount + " success.");
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Returns the balance of the {@link OverdraftAccount}.
     *
     * @return
     *      the {@link OverdraftAccount}'s balance.
     */
    public double getAccountBalance() {
        System.out.println("Return of account balance success");
        return getBalance();
    }

    /**
     * Return the {@link OverdraftAccount} state in {@link String} format.
     *
     * @return
     *          the String-representation of the state of the {@link OverdraftAccount}.
     */
    public String accountToString() {
        return "(" + id + ", " + iban + ", " + firstname + ", " + lastname
                + ", " + ssn + ", " + balance + ", Overdraft Limit: " + overdraftLimit + ")";
    }

    private boolean isSsnValid(String ssn) {
        return this.ssn.equals(ssn);
    }
}

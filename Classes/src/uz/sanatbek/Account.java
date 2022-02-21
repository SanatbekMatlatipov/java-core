package uz.sanatbek;

public class Account {
    private int number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account() {
        this(56789, 2.50, "Default name", "Default address", "Default phone");
        System.out.println("Empty constructor called");
    }

    public Account(int number, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Account with parameters constructor's called!");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Account(String customerName, String email, String phoneNumber) {
        this(99999, 100.55, customerName, email, phoneNumber);
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposit of " + amount + " made. New balance is " + this.balance);
    }

    public void withdrawal(double amount) {
        if (this.balance - amount < 0) {
            System.out.println("Only " + balance + " available. Withdrawal not processed");
            return;
        }
        this.balance -= amount;
        System.out.println("Withdrawal of " + amount + " processed. Remaining balance = " + balance);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

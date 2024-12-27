package section7inheritance.challegeexcerciseclass;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public Account () {
        this("56789", 2.50, "Default Name", "Default Email", "Default Phone");
        System.out.println("Empty constructor called");
    }

    public Account(String number, double balance, String customerName, String email, String phone) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = email;
        this.customerPhone = phone; 
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
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

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrawal successful -" + amount );
        } else {
            System.out.println("Insufficient balance, withdraw operation failed -" + amount );
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Amount is negative");
        } else {
            this.balance += amount;
            System.out.println("Deposit successful +" + amount);
        }
    }

    @Override
    public String toString() {
        return  "accountNumber='" + number + '\'' +
                ", \naccountBalance=" + balance +
                ", \ncustomerName='" + customerName + '\'' +
                ", \nemail='" + customerEmail + '\'' +
                ", \nphoneNumber='" + customerPhone + '\'';
    }
}

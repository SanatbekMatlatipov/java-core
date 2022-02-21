package uz.sanatbek;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String address;

    public VipCustomer() {
        this("Default Name", 1000.23, "Mirzo G'olib 6 uy, 29");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "Mirzo G'olib 6 uy, 29");
    }

    public VipCustomer(String name, double creditLimit, String address) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getAddress() {
        return address;
    }
}

package section7inheritance.challengeintheritance1;

public class HourlyPaidEmployee extends Employee {
    private double hourlyPayRate;

    public HourlyPaidEmployee(String name, String birthDate, String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay() {
        return 40 * hourlyPayRate;
    }

    public double getDoublePay() {
        return 2 * this.collectPay();
    }
}

package section7inheritance.challengeintheritance1;

public class Employee extends Worker {
    private static long employeeId = 0;
    private String hireDate;

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        employeeId++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                "hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}

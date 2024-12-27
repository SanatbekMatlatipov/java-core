package section7inheritance.challengeintheritance1;

public class Main {
    public static void main(String[] args) {
        Employee sanatbek = new Employee("Sanatbek", "12-04-1994", "22-03-2022");
        System.out.println(sanatbek);
        System.out.println("Age = " + sanatbek.getAge());
        System.out.println("Pay = " + sanatbek.collectPay());
        SalariedEmployee tim = new SalariedEmployee("Tim", "01-04-1984", "22-03-2022", 35000);
        System.out.println(tim);
        System.out.println("Tim's paycheck = $" + tim.collectPay());
        tim.retire();
        System.out.println("Tim's pension check = $" + tim.collectPay());
        HourlyPaidEmployee mary = new HourlyPaidEmployee("Mary", "15-05-1970", "03-03-2021", 15);
        System.out.println(mary);
        System.out.println("Mary's paycheck = $" + mary.collectPay());
        System.out.println("Mary's holiday check = $" + mary.getDoublePay());

    }
}

package uz.sanatbek;

public class Main {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
//        porsche.model = "Carrera"; // Never do this, encapsulation is good!
//        System.out.println("Model is " + porsche.getModel()); // null is internal default state for class's field
        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());

        /*
        *  Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field).
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
        // but not allow the withdrawal to complete if their are insufficient funds.
        // You will want to create various code in the Main class (the one created by IntelliJ) to
        // confirm your code is working.
        // Add some System.out.println's in the two methods above as well.
        * */
        Account bobsAccount = new Account();
        bobsAccount.setNumber(12345);
        bobsAccount.withdrawal(100.0);
        bobsAccount.setCustomerName("Bob Brown");
        bobsAccount.setEmail("myemail@bob.com");
        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);
        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);

        Account sanatsAccount = new Account();
//            new Account(12345, 0.00, "Sanatbek Matlatipov", "s.matlatipov@nuu,uz", "998939221994");
        System.out.println(sanatsAccount.getNumber());
        System.out.println(sanatsAccount.getBalance());
        sanatsAccount.deposit(50.0);
        sanatsAccount.withdrawal(100.0);
        sanatsAccount.deposit(51.0);
        sanatsAccount.withdrawal(100.0);

        Account timsAccount = new Account("Tim", "time@email.com", "12345");
        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());

//        Challenge for Constructor again
//        Create a new class VipCustomer
//        it should have 3 fields name, credit limit, and email address.
//         create 3 constructors
//         1st constructor empty should call the constructor with 3 parameters with default values
//         2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
//         3rd constructor should save all fields.
//         create getters only for this using code generation of intellij as setters wont be needed
//         test and confirm it works.
        VipCustomer defaultCustomer = new VipCustomer();
        System.out.println(defaultCustomer.getName());
        System.out.println(defaultCustomer.getCreditLimit());
        System.out.println(defaultCustomer.getAddress());
        VipCustomer sanatbek = new VipCustomer("Sanatbek", 250000.00);
        System.out.println(sanatbek.getName());
        System.out.println(sanatbek.getAddress());
        VipCustomer tim = new VipCustomer("Tim", 100.0, "USA");
        System.out.println(tim.getName());
        System.out.println(tim.getAddress());
    }
}

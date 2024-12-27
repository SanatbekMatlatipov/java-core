package section7inheritance.challegeexcerciseclass;

public class Main {
    public static void main(String[] args) {
          Account sanatsAccount = new Account();
//        Account sanatsAccount = new Account("123456789", 10000.0, "John Doe", "john.doe@gmail.com", "+998939221994");
//        System.out.println(sanatsAccount.getNumber());
//        System.out.println(sanatsAccount.getBalance());
//        Account account = new Account();
//        account.setNumber("123456789");
//        account.setBalance(1000);
//        account.setCustomerName("John Doe");
//        account.setCustomerEmail("john.doe@gmail.com");
//        account.setCustomerPhone("+998939221994");
        
        System.out.println(sanatsAccount);
        System.out.println("------------------");
        System.out.println("Account balance: " + sanatsAccount.getBalance());
        sanatsAccount.deposit(100);
        System.out.println("Account balance: " + sanatsAccount.getBalance());
        sanatsAccount.withdraw(200);
        System.out.println("Account balance: " + sanatsAccount.getBalance());
        sanatsAccount.withdraw(901);
        System.out.println("Account balance: " + sanatsAccount.getBalance());
        sanatsAccount.withdraw(10);
        System.out.println("Account balance: " + sanatsAccount.getBalance());

    }
}

package section7inheritance.challegeexcerciseclass;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.setNumber("123456789");
        account.setBalance(1000);
        account.setCustomerName("John Doe");
        account.setCustomerEmail("john.doe@gmail.com");
        account.setCustomerPhone("+998939221994");
        System.out.println(account);
        System.out.println("------------------");
        System.out.println("Account balance: " + account.getBalance());
        account.deposit(100);
        System.out.println("Account balance: " + account.getBalance());
        account.withdraw(200);
        System.out.println("Account balance: " + account.getBalance());
        account.withdraw(901);
        System.out.println("Account balance: " + account.getBalance());
        account.withdraw(10);
        System.out.println("Account balance: " + account.getBalance());

    }
}

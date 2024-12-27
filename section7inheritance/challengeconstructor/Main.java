package section7inheritance.challengeconstructor;

public class Main {
    public static void main(String[] args) {
        Customer sanatbek = new Customer("Sanatbek", 500000, "s.matlatipov@nuu.uz");
        System.out.println(sanatbek);
        Customer tim500 = new Customer("Tim", "tim@buchalka.com");
        System.out.println(tim500);
        Customer noArgCons = new Customer();
        System.out.println(noArgCons);
    }
}

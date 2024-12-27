package section7inheritance.inheritance;

public class Dog extends Animal {
    private String earShape;
    private String tailShape;

    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public Dog() {
        super("Matt", "Big", 50d);
    }

    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("Dogs wall, run and wag their tail");
        if (speed == "slow") {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();
    }

    @Override
    public void makeNoise() {
        if (type.equals("Wolf")) {
            System.out.print("Ow woooo!");
        }
        bark();
        System.out.println();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    private void bark() {
        System.out.print("Woof!");
    }

    private void run() {
        System.out.print("Dog running!");
    }

    private void walk() {
        System.out.print("Dog walking!");
    }

    private void wagTail() {
        System.out.print("Wage tail!");
    }
}

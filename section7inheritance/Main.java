package section7inheritance;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Maserati");
        car.setModel("Carr");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("Black");
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();

        Car chevrolet = new Car();
        chevrolet.setMake("Chevrolet");
        chevrolet.setModel("Equinox");
        chevrolet.setDoors(4);
        chevrolet.setConvertible(false);
        chevrolet.setColor("Black");

    }
}

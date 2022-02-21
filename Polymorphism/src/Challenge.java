enum FuelType {
    PETROL,
    DIESEL,
    GAS,
    ELECTRIC
}

class Car {
    private String name;
    private FuelType fuelType;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, FuelType fuelType, boolean engine, int cylinders, int wheels) {
        this.name = name;
        this.fuelType = fuelType;
        this.engine = engine;
        this.cylinders = cylinders;
        this.wheels = wheels;
    }

    public void startEngine() {
        System.out.println("Car.startEngine() is called. The car has started");
    }

    public void accelerate() {
        System.out.println("Car.accelerate() is called. The car is moving");
    }

    public void brake() {
        System.out.println("Car.brake() is called. The car is slowing");
    }

    public String getName() {
        return name;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }
}

class Nissan extends Car {

    public Nissan() {
        super("NISSAN GTX", FuelType.PETROL, true, 5, 4);
    }

    @Override
    public void startEngine() {
        System.out.println("Nissan.startEngine() is called. The Nissan has started");
    }

    @Override
    public void accelerate() {
        System.out.println("Nissan.accelerate() is called. The Nissan is moving");
    }

    @Override
    public void brake() {
        System.out.println("Nissan.brake() is called. The Nissan is slowing");
    }
}

class Tesla extends Car {

    public Tesla() {
        super("Tesla Model X", FuelType.ELECTRIC, false, 0, 4);
    }

    @Override
    public void startEngine() {
        System.out.println("Tesla.startEngine() is called. The Tesla has started");
    }

    @Override
    public void accelerate() {
        System.out.println("Tesla.accelerate() is called. The Tesla is moving");
    }

    @Override
    public void brake() {
        System.out.println("Tesla.brake() is called. The Tesla is slowing");
    }
}

class Honda extends Car {
    public Honda() {
        super("Honda Lit C-1", FuelType.ELECTRIC, false, 0, 2);
    }

    @Override
    public void startEngine() {
        System.out.println("HondaTwoWheel.startEngine() is called. The HondaTwoWheel has started");
    }

    @Override
    public void accelerate() {
        System.out.println("HondaTwoWheel.accelerate() is called. The HondaTwoWheel is moving");
    }

    @Override
    public void brake() {
        System.out.println("HondaTwoWheel.brake() is called. The HondaTwoWheel is slowing");
    }
}

public class Challenge {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            Car car = random();
            System.out.println("---------");
            System.out.println("Car #" + i + ": " + car.getName() + "\nWheels: "
                + car.getWheels() + "\nFuel type: " + car.getFuelType() + "\nCylinders: " + car.getCylinders());
            car.startEngine();
            car.accelerate();
            car.brake();
        }
    }

    public static Car random() {
        int randomNumber = (int) ((Math.random() * 3) + 1);
        switch (randomNumber) {
            case 1:
                return new Nissan();
            case 2:
                return new Tesla();
            case 3:
                return new Honda();
        }
        return null;
    }
}

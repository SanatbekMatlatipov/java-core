package section7inheritance.codingexercises;

public class Carpet {
    private double cost;

    public Carpet(double cost) {
        this.cost = Math.max(cost, 0d);
    }

    public double getCost() {
        return cost;
    }
}

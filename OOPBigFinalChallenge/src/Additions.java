public enum Additions {
    LETTUCE(0.2, "Lettuce"),
    TOMATO(1, "Tomato"),
    CARROT(0.5, "Carrot"),
    CHEESE(1.13, "CHEESE"),
    EG(1.43, "Egg"),
    CHIPS(2.74, "Chips"),
    DRINK(1.81, "Drink");

    public final double price;
    public final String label;

    private Additions(double price, String label) {
        this.price = price;
        this.label = label;
    }

    public double getPrice() {
        return price;
    }

    public String getLabel() {
        return label;
    }
}

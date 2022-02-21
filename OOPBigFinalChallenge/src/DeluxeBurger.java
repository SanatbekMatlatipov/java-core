public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe Burger", BreadRollType.WHEAT_BREAD, "Sausage and Bacon", 14.54);
        super.addAddition(Additions.CHIPS);
        super.addAddition(Additions.DRINK);
    }

    @Override
    public void addAddition(Additions addition) {
        System.out.println("Cannot add items to Deluxe burger");
    }
}

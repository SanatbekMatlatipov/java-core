import java.util.LinkedList;
import java.util.List;

public class Hamburger {
    private String name;
    private BreadRollType breadType;
    private String meat;
    private double basePrice;
    private double finalPrize;
    private List<Additions> additions;
    private double additionCount;

    public Hamburger(String name, BreadRollType breadType, String meat, double basePrice) {
        this.name = name;
        this.breadType = breadType;
        this.meat = meat;
        this.basePrice = basePrice;
        this.finalPrize = basePrice;
        additions = new LinkedList<>();
        additionCount = 0;
        System.out.println(name + " burger with ( " + breadType.getLabel() +", " + meat +
            ") is chosen with price " + basePrice + "$");
    }

    public void addAddition(Additions addition) {
        if (additions.contains(addition)) {
            System.out.println(addition.getLabel() + " item is already added to " + getName());
            return;
        }
        System.out.println(addition.getLabel() + " addition is being added to "+ getName() + " with price ..."
            + addition.getPrice() + "$.");
        additions.add(addition);
        additionCount++;
        this.finalPrize += addition.getPrice();
    }

    public void printCheque() {
        System.out.println("\u2606 \u2606 \u2606 \u2606 \u2606 \u2606 \u2606 \u2606 \u2606 \u2606 \u2606 \u2606");
        System.out.println("Cheque for " + getName());
        System.out.println("-------------------");
        System.out.println(getName() + " is ordered with (" + this.meat +" and " + this.breadType.getLabel() + ")" +
            " price -- " + this.basePrice + " $");
        String additionStringResult = "";
        for (Additions addition : additions) {
            additionStringResult += addition.getLabel() + " with price -- " + addition.getPrice() + "$\n";
        }
        if (!additionStringResult.isEmpty()) {
            System.out.println("Additions:");
            System.out.print(additionStringResult);
        }
        System.out.println("-------------------");
        System.out.println("Final price is: " + this.finalPrize + "$.");
        System.out.println("\u2606 \u2606 \u2606 \u2606 \u2606 \u2606 \u2606 \u2606 \u2606 \u2606 \u2606 \u2606\n");
    }

    public String getName() {
        return name;
    }
}

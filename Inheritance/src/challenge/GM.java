package challenge;

public class GM extends Car {
    private int roadServiceMonths;

    public GM(int roadServiceMonths) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }
}

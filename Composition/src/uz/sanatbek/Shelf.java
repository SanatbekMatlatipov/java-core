package uz.sanatbek;

public class Shelf extends Furniture {
    private String shelfType;

    public Shelf(String materialType, double width, double length, double height, String color, String shelfType) {
        super(materialType, width, length, height, color);
        this.shelfType = shelfType;
    }
}

package uz.sanatbek;



public class Desk extends Furniture{
    private DeskType type;

    public Desk(String materialType, double width, double length, double height, String color, DeskType type) {
        super(materialType, width, length, height, color);
        this.type = type;
    }

}

package uz.sanatbek;

public class Furniture {
    private String materialType;
    private double width;
    private double length;
    private double height;
    private String color;

    public Furniture(String materialType, double width, double length, double height, String color) {
        this.materialType = materialType;
        this.width = width;
        this.length = length;
        this.height = height;
        this.color = color;
    }

    public String getMaterialType() {
        return materialType;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }
}

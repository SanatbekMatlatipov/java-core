package uz.sanatbek;

public class RoomElectricityItems {
    private boolean isLightPlugON;
    private String powerPlugType;
    private int numberOfPlugType;

    public RoomElectricityItems(String powerPlugType, int numberOfPlugType) {
        this.isLightPlugON = false;
        this.powerPlugType = powerPlugType;
        this.numberOfPlugType = numberOfPlugType;
    }

    public void turnOnLight() {
        if (isLightPlugON) {
            System.out.println("Light is already ON");
            return;
        }
        System.out.println("Turning ON the --> Light");
        this.isLightPlugON = true;
        System.out.println("Turned ON the light");
    }

    public boolean isLightPlugON() {
        return isLightPlugON;
    }

    public String getPowerPlugType() {
        return powerPlugType;
    }

    public int getNumberOfPlugType() {
        return numberOfPlugType;
    }
}

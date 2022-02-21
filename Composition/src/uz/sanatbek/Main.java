package uz.sanatbek;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220", "Dell", "240", dimensions);
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
        PC thePC = new PC(theCase, theMonitor, theMotherboard);
//        thePC.powerUp();

        Shelf shelf = new Shelf("Wooden", 1d, 2d, 3d, "GRAY", "SlidingDoor");
        Desk desk = new Desk("Wooden", 0.5d, 2d, 1.2, "GRAY", DeskType.STANDALONE_TWO_LEGS);
        RoomElectricityItems roomElectricityItems = new RoomElectricityItems("TypeC", 3);
        OfficeRoom myOffice = new OfficeRoom(desk, shelf, thePC, roomElectricityItems, 4, 6, 5);
        myOffice.electricity.turnOnLight();
        myOffice.pc.powerUp();
        myOffice.electricity.turnOnLight();
    }
}

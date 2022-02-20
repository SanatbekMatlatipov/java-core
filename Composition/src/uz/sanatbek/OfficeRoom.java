package uz.sanatbek;


public class BedRoom {
    Desk desk;
    Shelf shelf;
    PC pc;
    RoomElectricityItems electricity;
    int width;
    int length;
    int height;

    public BedRoom(Desk desk, Shelf shelf, PC pc, RoomElectricityItems electricity, int width, int length, int height) {
        this.desk = desk;
        this.shelf = shelf;
        this.pc = pc;
        this.electricity = electricity;
        this.width = width;
        this.length = length;
        this.height = height;
    }



}

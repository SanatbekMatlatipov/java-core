public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Sanatbek";
//        player.health = 20;
//        player.weapon = "Sword";
//        int damage = 10;
//        player.looseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.looseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
        EnhancedPlayer player = new EnhancedPlayer("Sanatbek", 200, "Sword");
        System.out.println("Initial health is " + player.getHealth());
        // Create a class and demonstate proper encapsulation techniques
        // the class will be called Printer
        // It will simulate a real Computer Printer
        // It should have fields for the toner Level, number of pages printed, and
        // also whether its a duplex printer (capable of printing on both sides of the paper).
        // Add methods to fill up the toner (up to a maximum of 100%), another method to
        // simulate printing a page (which should increase the number of pages printed).
        // Decide on the scope, whether to use constructors, and anything else you think is needed.
        Printer printer = new Printer(70, 200, false);
        printer.print(10);
        printer.fillUpToner();
        System.out.println("Pages printed so far -> " + printer.getNumberOfPrintedPages());
    }
}

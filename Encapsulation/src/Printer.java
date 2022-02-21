public class Printer {
    private static final int FULL = 100;
    private int tonerLevel = FULL;
    private int numberOfPrintedPages = 0;
    private boolean isDuplex = false;

    public Printer(int tonerLevel, int numberOfPrintedPages, boolean isDuplex) {
        this.tonerLevel = tonerLevel >= 0 && tonerLevel <= 100 ? tonerLevel : this.tonerLevel;
        this.numberOfPrintedPages = numberOfPrintedPages >= 0 ? numberOfPrintedPages : this.numberOfPrintedPages;
        this.isDuplex = isDuplex;
    }

    public void fillUpToner() {
        System.out.println("Filling up the toner. Wait!...");
        this.tonerLevel = FULL;
        System.out.println("Toner is filled up: " + this.tonerLevel);
    }

    public void print(int numberOfPagesToBePrint) {
        System.out.print("Printing....");
        if (isDuplex()) {
            System.out.print("(Duplex mode)");
            this.numberOfPrintedPages += ((numberOfPagesToBePrint + 1) / 2);
        } else {
            System.out.print("(Single side mode)");
            this.numberOfPrintedPages += numberOfPagesToBePrint ;
        }
        System.out.println();
        System.out.println("Printing is done!");
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public int getNumberOfPrintedPages() {
        return numberOfPrintedPages;
    }
}

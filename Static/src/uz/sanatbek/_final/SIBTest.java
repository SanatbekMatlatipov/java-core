package uz.sanatbek._final;

public class SIBTest {
    private static final String owner;

    static {
        owner = "time";
        System.out.println("SIBTest static initialization block called");
    }

    public SIBTest() {
    }

    static {
        System.out.println("2nd initialization block called");
    }

    public void someMethod() {
        System.out.println("Some method");
    }
}

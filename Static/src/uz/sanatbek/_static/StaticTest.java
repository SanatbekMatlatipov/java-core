package uz.sanatbek._static;

public class StaticTest {
    private static int numInstance = 0;
    private String name;

    public StaticTest(String name) {
        this.numInstance++;
        this.name = name;
    }

    public static int getNumInstance() {
        return numInstance;
    }

    public void setNumInstance(int numInstance) {
        this.numInstance = numInstance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

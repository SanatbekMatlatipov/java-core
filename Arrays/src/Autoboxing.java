import java.util.ArrayList;

public class Autoboxing {
    public static void main(String[] args) {
        Integer integer = 54;
        Double doubleValue = 12.25;
        ArrayList<Integer>  integerArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integerArrayList.add(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " --> " + integerArrayList.get(i));
        }
    }
}

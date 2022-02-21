import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<String>();

        arr.add("One");
        arr.add("Two");
        arr.add("Three");
        arr.add("Four");

        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>(new String[]{"One", "Two"});

        try {
            // Printing the elements
            System.out.println("ArrayList: ");
            Iterator<String> iter = arr.iterator();

            while (iter.hasNext()) {

                System.out.print(iter.next() + ", ");

                // ConcurrentModificationException
                // is raised here as an element
                // is added during the iteration
                System.out.println("\n\nTrying to add" + " an element in " + "between iteration\n");
                arr.remove("Two");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

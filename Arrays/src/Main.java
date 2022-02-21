import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] myIntArray = new int[100]; //{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        myIntArray[0] = 45;
//        myIntArray[1] = 476;
//        myIntArray[5] = 50;
//        myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        double[] myDoubleArray = new double[10];
//        System.out.println(myIntArray[0]);
//        System.out.println(myIntArray[6]);
//        System.out.println(myIntArray[8]);
//        for (int i = 0; i < myIntArray.length; i++) {
//            myIntArray[i] = i * 10;
//        }
//        for (int i = 0; i < myIntArray.length; i++) {
//            System.out.println("Element " + i + ", value is " + myIntArray[i]);
//        }
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;
        System.out.println("myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("anotherArray=" + Arrays.toString(anotherArray));
        anotherArray[0] = 1;
        System.out.println("After change myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("After change anotherArray=" + Arrays.toString(anotherArray));
        modifyArray(myIntArray);
        System.out.println("After modifier myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("After modifier anotherArray=" + Arrays.toString(anotherArray));
    }
    private static void modifyArray(int [] array) {
        array[0] = 2;
        array = new int[] {1, 2, 3, 4, 5};

    }
}

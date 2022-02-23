package uz.sanatbek;

import java.util.ArrayList;
import java.util.Arrays;

public class A_ArrayVsArrayList {
    public static void main(String[] args) {
        String[] friendsArray = new String[4]; // Fixed size arrays - Size never changes once created
        String[] friendsArray2 = {"John", "Chris", "Eric", "Luke"}; // Arrays - can hold primitive types or objects
        System.out.println(friendsArray2[1]); //  index specified which starts at 0

//        ArrayList<int> friendsArrayList = new ArrayList<>(); // Arraylist - Grows and shrinks automatically
        ArrayList<String> friendsArrayList2 =
            new ArrayList<>(Arrays.asList("John", "Chris", "Eric", "Luke")); // ArrayList - can hold objects.
        // But supports wrapper class types for primitives
        System.out.println(friendsArrayList2.get(1));// Getting an element in both similar functionality,
        // just slightly different syntax
        // Getting size - again pretty similar for Arrays and ArrayList, just a field vs a method call
        System.out.println(friendsArray.length);
        System.out.println(friendsArrayList2.size());

        System.out.println(friendsArray);
        System.out.println(friendsArrayList2);// Printing array is easy

    }
}

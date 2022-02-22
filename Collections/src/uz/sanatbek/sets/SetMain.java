package uz.sanatbek.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i = 1; i <= 100; i++) {
            squares.add(i * i);
            cubes.add(i * i * i);
        }
        System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes.");
        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("Union contains " + union.size() + " elements.");

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection contains " + intersection.size() + " elements");
        for (int i : intersection) {
            System.out.println(i + " is the square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
        }
        String sentence = "One day in the year of the box";
        String[] arrayWords = sentence.split(" ");
        Set<String> words = new HashSet<>(Arrays.asList(arrayWords));
        for (String s : words) {
            System.out.println(s);
        }
        String[] arrayNatureWords = {"all", "nature", "is", "but", "art", "unknown", "to", "three"};
        Set<String> nature = new HashSet<>(Arrays.asList(arrayNatureWords));

        String[] arrayDivineWords = {"to", "err", "is", "human", "to", "forgive", "divine"};
        Set<String> divine = new HashSet<>(Arrays.asList(arrayDivineWords));

        System.out.println("nature - divine:");
        Set<String> subtractionNatureDivine = new HashSet<>(nature);
        subtractionNatureDivine.removeAll(divine);
        printSet(subtractionNatureDivine);

        System.out.println("divine - Nature:");
        Set<String> subtractionDivineNature = new HashSet<>(divine);
        subtractionDivineNature.removeAll(nature);
        printSet(subtractionDivineNature);

        Set<String> unionTest = new HashSet<>(nature);
        unionTest.addAll(divine);
        System.out.println("Union of two sets: ");
        printSet(unionTest);

        Set<String> intersectionTest = new HashSet<>(nature);
        union.retainAll(intersectionTest);
        System.out.println("Intersection of two sets: ");
        unionTest.removeAll(intersectionTest);
        printSet(unionTest);

        if (nature.containsAll(divine)) {
            System.out.println("Divine is a subset of nature");
        }
        if (nature.containsAll(intersectionTest)) {
            System.out.println("intersection is a subset of a divine");
        }
    }

    private static void printSet(Set<String> set) {
        System.out.print("\t");
        for (String s: set) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}

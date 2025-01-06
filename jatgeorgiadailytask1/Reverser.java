package jatgeorgiadailytask1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reverser {
    private final String inputString;
    private List<String> tokens;

    public Reverser(String inputString) {
        this.inputString = inputString;
    }

    public void solve() {
        if (inputString.isEmpty() || inputString.isBlank()) {
            throw new BlankInputStringException("BlankInputStringException: Input string is empty");
        }
        tokens = new ArrayList<>(Arrays.asList(inputString.trim().split("\\s+")));
        tokens.removeIf(String::isEmpty);
        if (tokens.size() <= 1) {
            throw new SingleWordException("SingleWordException: Input string has a single word");
        }
        String result = reverse();
        System.out.println(result);

    }

    private String reverse() {
        int start = 0;
        int end = tokens.size() - 1;
        while (start < end) {
            while (start < end && Character.isUpperCase(tokens.get(start).charAt(0))) {
                start++;
            }
            while (end > start && Character.isUpperCase(tokens.get(end).charAt(0))) {
                end--;
            }
            if (start < end) {
                String temp = tokens.get(start);
                tokens.set(start, tokens.get(end));
                tokens.set(end, temp);
                start++;
                end--;
            }
        }
        return String.join(" ", tokens);
    }
}

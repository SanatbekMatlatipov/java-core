package jatgeorgiadailytask1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("jatgeorgiadailytask1/input.txt"));
        while (scanner.hasNextLine()) {
            String inputString = scanner.nextLine();
            Reverser reverser = new Reverser(inputString);
            try {
                reverser.solve();
            } catch (SingleWordException | BlankInputStringException e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
        PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));
        pw.close();
    }

}

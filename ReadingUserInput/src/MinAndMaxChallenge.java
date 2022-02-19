import java.util.Scanner;

//-Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
//-Before the user enters the number, print the message ÅgEnter number:Åh
//-If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
//
//Hint:
//-Use an endless while loop.
//
//Bonus:
//-Create a project with the name MinAndMaxInputChallenge.
public class MinAndMaxChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        System.out.println("Enter number:");
        while (sc.hasNextInt()) {
            System.out.println("Enter number:");
            int number = sc.nextInt();
            max = Math.max(number, max);
            min = Math.min(number, min);
        }
        System.out.println("Maximum value is : " + max);
        System.out.println("Minimum value is : " + min);
        sc.close();
    }
}

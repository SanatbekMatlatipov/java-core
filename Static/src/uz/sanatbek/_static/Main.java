package uz.sanatbek._static;

import uz.sanatbek._final.ExtendedPassword;
import uz.sanatbek._final.Password;
import uz.sanatbek._final.SIBTest;
import uz.sanatbek._final.SomeClass;

public class Main {
    public static int multiplier = 7;
    public static void main(String[] args) {
//        StaticTest firstInstance = new StaticTest("1st Instance");
//        System.out.println(firstInstance.getName() + " is instance number " +StaticTest.getNumInstance());
//
//        StaticTest secondInstance = new StaticTest("2nd instance");
//        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstance());
//
//        StaticTest thirdInstance = new StaticTest("3rd instance");
//        System.out.println(thirdInstance.getName() + " is instance number " + StaticTest.getNumInstance());

        // java com.company._static.Main
        int answer = multiply(6);
        System.out.println("The answer is " + answer);
        System.out.println("Multiplier is " + multiplier);

        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");
        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

        System.out.println(Math.PI);
//        Math m = new Math();
//        String
        int pw = 674312;
        Password password = new ExtendedPassword(pw);
        password.storePassword();
        password.letMeIn(1);
        password.letMeIn(523266);
        password.letMeIn(59773);
        password.letMeIn(-1);
        password.letMeIn(747902050);

//        System.out.println("Main method called");
//        SIBTest sibTest = SIBTest();
//        sibTest.someMethod();
//        System.out.println();
    }
    public static int multiply(int number) {
        return number * multiplier;
    }
}

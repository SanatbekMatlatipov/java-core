public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int digitCount = getDigitCount(number);
        number = reverse(number);
        while (number > 0) {
            switch (number % 10) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            digitCount--;
            number /= 10;
        }
        while (digitCount-- > 0) {
            System.out.println("Zero");
        }
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        boolean isNegativeNumber = number < 0;
        number = Math.abs(number);
        int digitCount = getDigitCount(number);
        while (number > 0) {
            reversedNumber += ((number % 10) * Math.pow(10, --digitCount));
            number /= 10;
        }
        return !isNegativeNumber ? reversedNumber : (-1 * reversedNumber);
    }

    public static int getDigitCount(int number) {
        if (number < 0)
            return -1;
        int count = 1, decimal = 1;
        while (true) {
            decimal *= 10;
            if (number / decimal == 0)
                break;
            count++;
        }
        return count;
    }
}

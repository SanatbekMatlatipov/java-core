public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number <= 1)
            return -1;
        int largestPrime = -1;
        for (int i = number; i > 1; i--) {
            boolean isPLargestPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPLargestPrime = false;
                    break;
                }
            }
            if (isPLargestPrime && number % i ==0) {
                largestPrime = i;
                break;
            }
        }
        return largestPrime;
    }
}

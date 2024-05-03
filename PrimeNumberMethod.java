package Junit;

/**
 * This class provides a method to print the first n prime numbers and a method to check if a number is prime.
 */
public class PrimeNumberMethod {

    /**
     * Prints the first n prime numbers.
     *
     * @param numberOfPrimes The number of prime numbers to print.
     */
    public static void printPrimeNumbers(int numberOfPrimes) {
        final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
        int count = 0; // Count the number of prime numbers
        int number = 2; // A number to be tested for primeness

        // Repeatedly find prime numbers
        while (count < numberOfPrimes) {
            // Print the prime number and increase the count
            if (isPrime(number)) {
                count++; // Increase the count

                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    // Print the number and advance to the new line
                    System.out.printf("%-5s\n", number);
                } else {
                    System.out.printf("%-5s", number);
                }
            }

            // Check if the next number is prime
            number++;
        }
    }

    /**
     * Checks whether a given number is prime.
     *
     * @param number The number to check for primeness.
     * @return {@code true} if the number is prime, {@code false} otherwise.
     */
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 0 and 1 are not prime
        }
        for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
            if (number % divisor == 0) { // If true, number is not prime
                return false; // number is not a prime
            }
        }
        return true; // number is prime
    }

    public static void main(String[] args) {
        System.out.println("The first 50 prime numbers are \n");
        printPrimeNumbers(50);
    }
}

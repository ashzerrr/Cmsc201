package Junit;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This class provides JUnit tests for the {@link PrimeNumberMethod} class.
 */
public class PrimeNumberMethodTest {
    
    /**
     * Test case to verify the behavior of the isPrime method with a prime number.
     */
    @Test
    public void testIsPrimeWithPrimeNumber() {
        int primeNumber = 7;
        boolean expectedResult = true;
        boolean actualResult = PrimeNumberMethod.isPrime(primeNumber);
        assertEquals(expectedResult, actualResult);
    }
    
    /**
     * Test case to verify the behavior of the isPrime method with a composite number.
     */
    @Test
    public void testIsPrimeWithCompositeNumber() {
        int compositeNumber = 6;
        boolean expectedResult = false;
        boolean actualResult = PrimeNumberMethod.isPrime(compositeNumber);
        assertEquals(expectedResult, actualResult);
    }
    
    /**
     * Test case to verify the behavior of the isPrime method with a negative number.
     */
    @Test
    public void testIsPrimeWithNegativeNumber() {
        int negativeNumber = -5;
        boolean expectedResult = false;
        boolean actualResult = PrimeNumberMethod.isPrime(negativeNumber);
        assertEquals(expectedResult, actualResult);
    }
}

package Junit;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringTest {
    
    @Test
    public void testLength() {
        String str = "hello classmate";
        int expectedLength = 15;
        int actualLength = str.length();
        assertEquals(expectedLength, actualLength);
    }
    
    @Test
    public void testCharAt() {
        String str = "hello classmate";
        char expectedChar = 'c';
        char actualChar = str.charAt(6);
        assertEquals(expectedChar, actualChar);
    }
    
    @Test
    public void testSubstring() {
        String str = "hello classmate";
        String expectedSubstring = "classmate";
        String actualSubstring = str.substring(6);
        assertEquals(expectedSubstring, actualSubstring);
    }
    
    @Test
    public void testIndexOf() {
        String str = "hello classmate";
        int expectedIndex = 2;
        int actualIndex = str.indexOf('l');
        assertEquals(expectedIndex, actualIndex);
    }
}

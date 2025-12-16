/* 

 * Class: CMSC201  

 * Instructor: Grigoriy Grinberg

 * Description: This JUnit Test that test the method isPrime to make sure it is running correctly

 * Due: 12/15/25 

 * I pledge that I have completed the programming assignment independently. 

   I have not copied the code from a student or any source. 

   I have not given my code to any student. 

   Print your Name here: Alex Nizeyimana 

*/ 
package chapter6;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PrimeNumberMethodTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("Running the Prime Number Method Test");
    }

    @Test
    public void testIsPrimeWithPrimeNumbers() {
        assertTrue(PrimeNumberMethod.isPrime(2));
        assertTrue(PrimeNumberMethod.isPrime(3));
        assertTrue(PrimeNumberMethod.isPrime(5));
        assertTrue(PrimeNumberMethod.isPrime(13));
        assertTrue(PrimeNumberMethod.isPrime(71));
    }

    @Test
    public void testIsPrimeWithNonPrimeNumbers() {
        assertFalse(PrimeNumberMethod.isPrime(4));
        assertFalse(PrimeNumberMethod.isPrime(20));
        assertFalse(PrimeNumberMethod.isPrime(50));
        assertFalse(PrimeNumberMethod.isPrime(60));
        assertFalse(PrimeNumberMethod.isPrime(100));
    }
}


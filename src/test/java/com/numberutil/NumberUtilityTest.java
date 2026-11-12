package com.numberutil;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NumberUtilityTest {

    private final NumberUtility utility = new NumberUtility();

    @Test
    public void testIsEven() {
        assertTrue(utility.isEven(4));
        assertFalse(utility.isEven(5));
        assertTrue(utility.isEven(0));
        assertTrue(utility.isEven(-2));
    }

    @Test
    public void testIsOdd() {
        assertFalse(utility.isOdd(4));
        assertTrue(utility.isOdd(5));
        assertFalse(utility.isOdd(0));
        assertFalse(utility.isOdd(-2));
    }

    @Test
    public void testIsPrime() {
        assertTrue(utility.isPrime(2));
        assertTrue(utility.isPrime(13));
        assertFalse(utility.isPrime(1));
        assertFalse(utility.isPrime(0));
        assertFalse(utility.isPrime(-5)); // Negative numbers are not prime
        assertFalse(utility.isPrime(4));
    }
}
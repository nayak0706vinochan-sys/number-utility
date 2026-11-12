package com.numberutil;

public class Main {
    public static void main(String[] args) {
        NumberUtility util = new NumberUtility();
        System.out.println("--- Number Utility Application ---");
        System.out.println("Is 7 prime? " + util.isPrime(7));
        System.out.println("Is 4 even? " + util.isEven(4));
        System.out.println("Is 5 odd? " + util.isOdd(5));
    }
}
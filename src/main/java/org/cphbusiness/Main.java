package org.cphbusiness;

public class Main {
    public static void main(String[] args) {
        fizzBuzz();
    }

    public static void fizzBuzz() {
        for (int i = 1; i <= 200; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("BuzzFizz");
            }
        }
    }
}
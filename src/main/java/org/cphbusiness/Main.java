package org.cphbusiness;

public class Main {
    public static void main(String[] args) {
        fizzBuzz();
        printNumbers(1, 10);
    }

    public static void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
        }
    }

    public static void printNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }

    }


}
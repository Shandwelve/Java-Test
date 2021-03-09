package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Introduce first number: ");
        int secondNumber = scanner.nextInt();
        System.out.println(firstNumber + " " + secondNumber);

        if(Main.isEqualsDigits(firstNumber, secondNumber)) {
            System.out.println("Digits sum is equal");
        } else {
            System.out.println("Digits sum is not equal");
        }
    }

    private static boolean isEqualsDigits(int firstNumber, int secondNumber) {
        return Main.sumOfDigits(firstNumber) == Main.sumOfDigits(secondNumber);
    }

    private static int sumOfDigits(int number) {
        return Arrays.stream(String.valueOf(number).split("")).mapToInt(Integer::parseInt).sum();
    }
}

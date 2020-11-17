package com.company;

import java.util.Scanner;

public class homework54 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("smollis number is" + SmoleNumber(NumbersOFConsole()));

    }

    public static int[] NumbersOFConsole() {
        System.out.println("enter number1");
        int number1 = scanner.nextInt();
        System.out.println("enter number2");
        int number2 = scanner.nextInt();
        System.out.println("enter number3");
        int number3 = scanner.nextInt();
        return new int[]{number1, number2, number3};
    }

    public static int SmoleNumber(int[] array) {
        int MinNumber = array[0];
        for (int j : array) {
            if (MinNumber > j) {
                MinNumber = j;
            }
        }
        return MinNumber;
    }
}

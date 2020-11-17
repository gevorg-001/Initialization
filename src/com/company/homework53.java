package com.company;

import java.util.Scanner;

public class homework53 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(ProductOfNumbersCuber(NumbersOfConsole()));

    }

    public static int[] NumbersOfConsole() {
        System.out.println("Enter first number");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number");
        int number2 = scanner.nextInt();
        return new int[]{number1, number2};
    }

 //   public static int ProductOfNumbers(int[] array) {
 //       return array[0] * array[1];
  //  }

    public static int ProductOfNumbersCuber(int[] array) {
        return (int) (Math.pow(array[0], 3) * Math.pow(array[1], 3));
    }
}

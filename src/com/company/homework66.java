package com.company;

import java.util.Scanner;

public class homework66 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(Factorial(ARRAY()));
    }

    public static int[] ARRAY() {
        System.out.println("enter number");
        int number = scanner.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;

        }
        return array;
    }public static int Factorial(int[] array){
        int factorial = 1;
        for (int i : array){
            factorial*=i;
        }return factorial;
    }
}

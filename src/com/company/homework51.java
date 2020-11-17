package com.company;

import java.util.Random;

public class homework51 {
    static Random random = new Random();

    public static void main(String[] args) {
        System.out.println(SumOfNumbers(randomnumber()));
    }
    public static int[] randomnumber() {
        int number1 = random.nextInt(99);
        int number2 = random.nextInt(99);
        return new int[]{number1, number2};
    }
    public static int SumOfNumbers(int[] array) {
        return array[0] + array[1];
    }
}
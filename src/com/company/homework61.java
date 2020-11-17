package com.company;

import java.util.Random;

public class homework61 {
    static Random random = new Random();

    public static void main(String[] args) {
        ArrayOfRight(Array());
    }

    public static int[] Array() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(99);
        }
        System.out.println("tis is a area");
        for (int j : array) {
            System.out.print(+j + " ");
        }
        System.out.println();
        return array;
    }

    public static void ArrayOfRight(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }

        }
        System.out.println("This is a rigt area");
        for (int j : array) {
            System.out.print(j + " ");

        }
    }
}


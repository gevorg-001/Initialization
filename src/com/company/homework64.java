package com.company;

import java.util.Random;

public class homework64 {
    static Random random = new Random();

    public static void main(String[] args) {
        Arranger(array());
    }

    public static int[] array() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(99);
            System.out.print(array[i] + " ");
        }
        return array;
    }

    public static void Arranger(int[] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            int j = 10;
            while (j < array.length) {
                array[i] = array[j];
                j--;
            }
        }
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}


package com.company;

import java.util.Scanner;

public class homework70 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter number");
        int pr = scanner.nextInt();
        System.out.println("enter number");
        int ps = scanner.nextInt();
        int[][] array = new int[pr][ps];
        Matrix(array);
        while (true) {
            System.out.println("""
                    ———————- MENU —————-
                    Press 1 For rotating 90*
                    Press 2 For rotating 180*
                    Press 3 For rotating 270*
                    Press 4 to Exit
                    ————————————————
                    """);
            int turn = scanner.nextInt();
            if (turn == 1) {
                Pocitani(turnToLeft(array));
            } else if (turn == 2) {
                Pocitani(turnToRight(array));
            } else if (turn == 3) {
                Pocitani(array);
            } else {
                break;
            }
        }

    }


    public static void Matrix(int[][] array) {
        com.company.homework69.array = array;
        int s = 0;
        System.out.println("Matrix");
        for (int i = 0; i < array.length; i++, System.out.println()) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = s + 1;
                s = s + 1;
                System.out.print(array[i][j] + " ");
            }
        }
    }

    public static int[][] turnToRight(int[][] array) {
        System.out.println("Rotovana matice");
        int[][] result = new int[array[0].length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                result[j][array.length - i - 1] = array[i][j];
            }
        }
        return result;
    }

    public static int[][] turnToLeft(int[][] array) {
        System.out.println("Rotovana matice");
        int[][] result = new int[array[0].length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                result[array[i].length - j - 1][i] = array[i][j];
            }
        }
        return result;
    }


    public static void Pocitani(int[][] array) {
        for (int i = 0; i < array.length; i++, System.out.println()) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }
}



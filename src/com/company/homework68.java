package com.company;

import java.util.Random;
import java.util.Scanner;

public class homework68 {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    public static void main(String[] args) {
        newmatrix(MAtrix());

    }public static String[][] MAtrix(){
        System.out.println("enter number");
        int number = scanner.nextInt();
        return new String[number][number];
    }public  static void newmatrix(String[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                int tipe = random.nextInt(2);
                if (tipe==1){
                    matrix[i][j]= "+";
                }else {matrix[i][j]="-";}
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

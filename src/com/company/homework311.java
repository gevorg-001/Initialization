package com.company;

import java.util.Scanner;

public class homework311 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i == 2) {
            System.out.println("this is a odd number");
        } else if (i == 3) {
            System.out.println("this is a odd number");
        } else if (i == 5) {
            System.out.println("this is a odd number");
        } else if (i == 7) {
            System.out.println("this is a odd number");
        } else if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0)
            System.out.println("this is a simple number");
        else {
            System.out.println(" this is a odd number");
        }
    }
}




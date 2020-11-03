package com.company;

import java.util.Scanner;

public class homework26 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter number1");
        int number1 = scanner.nextInt();
        System.out.println("enter number2");
        int number2 = scanner.nextInt();

        switch (number1 / number2){
            case 1:
                System.out.println("number1 / number2 = 1");
            break;
            case 2:
                System.out.println("number1 / number2 = 2");
            break;
            case 3:
                System.out.println("number1 / number2 = 3");
            break;
            default:
                System.out.println("number1 / number2 = other number");

        }

    }
}

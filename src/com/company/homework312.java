package com.company;

public class homework312 {
    public static void main(String[] args) {

        int n = 10, number1 = 0, number2 = 1;
        System.out.print("First " + n + " terms: ");
        for (int i = 1; i <= n; ++i) {
            System.out.print(number1 + " , ");
            int sum = number1 + number2;
            number1 = number2;
            number2 = sum;
        }
    }
}


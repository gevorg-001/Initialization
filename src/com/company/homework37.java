package com.company;

public class homework37 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                System.out.println();}
            else {
                sum += i; }
        }System.out.println(sum  + 2 + 3 + 5 + 7);
    }
}

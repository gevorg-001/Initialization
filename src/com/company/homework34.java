package com.company;

public class homework34 {
    public static void main(String[] args) {

        for (int i = -20; i <= 60; i++) {
            if (i % 2 == -1 || i % 2 == 1) {
                continue;
            }
            System.out.print(i + ",");
        }
    }
}



package com.company;

public class homework63 {
    public static void main(String[] args) {
        number();
    }

    public static void number() {

        for (int i = 0; i < 100; i++) {
            int numbers = i + 1;
            if (numbers % 2 != 0 && numbers % 3 != 0 && numbers % 5 != 0 && numbers % 7 != 0) {
                System.out.print(numbers + " ");
            }

        }
    }
}
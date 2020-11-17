package com.company;

import java.util.Scanner;

public class homework65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println(palindrom(word));
    }

    public static boolean palindrom(String word) {
        boolean palindrom = false;
        int LEterword = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(word.length() - i - 1)) {
                LEterword++;
            }
        }
        if (LEterword == word.length()) {
            palindrom = true;
        }
        return palindrom;
    }
}

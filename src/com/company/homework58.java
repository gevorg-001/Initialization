package com.company;

import java.util.Scanner;

public class homework58 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(
                """
                        1. A password must have at least ten characters.
                        2. A password consists of only letters and digits.
                        3. A password must contain at least two digits\s
                        """);
        String s = input.nextLine();

        if (is_Valid_Password(s)) {
            System.out.println("Password is valid: " + s);
        } else {
            System.out.println("Not a valid password: " + s);
        }

    }

    public static boolean is_Valid_Password(String password) {
        int paswordlenght = 10;
        if (password.length() < paswordlenght) return false;

        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (is_Numeric(ch)) numCount++;
            else if (is_Letter(ch)) charCount++;
            else return false;
        }

        return (charCount >= 2 && numCount >= 2);
    }

    public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }

    public static boolean is_Numeric(char ch) {
        return (ch >= '0' && ch <= '9');
    }
}







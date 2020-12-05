package com.company;

import java.util.Scanner;

public class InitializingForCharSequence {

    Scanner scanner = new Scanner(System.in);
    String text = scanner.nextLine();

    CharSequence charSequence;
    {
        charSequence = new CharSequence() {
            @Override
            public int length() {
                int length = 0;
                for (int i = 0; i <= text.length(); i++) {
                    if (text.length() == i) {
                        length = i;
                    }
                }
                return length;
            }

            @Override
            public char charAt(int index) {
                return text.charAt(index);
            }

            @Override
            public CharSequence subSequence(int start, int end) {

                return text.subSequence(start, end);
            }
        };
    }

}

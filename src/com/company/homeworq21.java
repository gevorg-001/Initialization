package com.company;

import java.util.Random;

public class homeworq21 {

    public static void main(String[] args) {

        Random random = new Random();
        int number1 = random.nextInt(55) + 45;
        int number2 = random.nextInt(55) + 45;
        long result = number1 + number2;
        System.out.println(result);

    }
}

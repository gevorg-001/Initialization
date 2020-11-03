package com.company;

import java.util.Random;

public class homework28 {

    public static void main(String[] args) {

        Random random = new Random();
        int number1 = random.nextInt(55) + 45;
        int number2 = random.nextInt(55) + 45;

        if(number1>number2){
            System.out.println(number1 + number2);
        }
        else if (number1 < number2){

            System.out.println(number1 * number2);
        }
        else{
                System.out.println(Math.pow(number1, 2));
            }
        }

    }
package com.company;

import java.util.Scanner;

public class homework56 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("please enter year");
        int year = scanner.nextInt();
        LeapYear(year);
    }

    public static void LeapYear(int year) {
        if (year % 4 == 0) {
            System.out.println("thet year is loapyear");}
          else {
                System.out.println("thet year is not loap year");
            }
        }
    }

package com.company;

import java.util.Scanner;

public class homework59 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(CircleOfArea(radeusInConsole()));
        System.out.println(PerimetrOfArea(radeusInConsole()));
    }

    public static int radeusInConsole() {
        return   scanner.nextInt();

    }

    public static double CircleOfArea(int radeus) {
        return  Math.pow(radeus, 2) * Math.PI;
    }

    public static double PerimetrOfArea(int radeus) {
        return   2 * radeus * Math.PI;

    }
}



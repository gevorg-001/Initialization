package com.company.Game;

import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        Swordsman swordsman = new Swordsman("Swords", 800, 200);
        Magic magic = new Magic("Magic", 1200, 50, 25);
        Archer archer = new Archer("Archer", 1500, 100, 50);

        Players[] gamer = {swordsman, magic, archer};
        System.out.println("Please chuze a gamer1");
        int gamer1 = scanner.nextInt();
        switch (gamer1) {
            case 1:
                System.out.println("You are chuz swordsman");
                break;
            case 2:
                System.out.println("You are chuz magic");
                break;
            case 3:
                System.out.println("You are chuz archer");
                break;
        }
        System.out.println("please chuze a gamer2");
        int gamer2 = scanner.nextInt();
        switch (gamer2) {
            case 1:
                System.out.println("You are chuz swordsman");
                break;
            case 2:
                System.out.println("You are chuz magic");
                break;
            case 3:
                System.out.println("You are chuz archer");
                break;
        }
        Players gamer_1 = gamer[gamer1 - 1];
        Players gamer_2 = gamer[gamer2 - 1];

        while (true) {
            gamer_1.attackt(gamer_2);
            gamer_2.attackt(gamer_1);
            System.out.println();
            if (gamer_1.getLive() <= 0) {
                System.out.println(gamer_2.getName() + " win");
                break;
            } else if (gamer_2.getLive() <= 0) {
                System.out.println(gamer_1.getName() + " win");
                break;

            }


        }


    }

}


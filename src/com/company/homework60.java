package com.company;

import java.util.Scanner;

public class homework60 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();
        int[] sideOfTriangle = {side1, side2, side3};
        triangleOfVile(sideOfTriangle);
    }

    public static void triangleOfVile(int[] SideOfTriangle) {
        if (SideOfTriangle[0] * SideOfTriangle[0] > SideOfTriangle[1] * SideOfTriangle[2] ||
                SideOfTriangle[1] * SideOfTriangle[1] > SideOfTriangle[0] * SideOfTriangle[2] ||
                SideOfTriangle[2] * SideOfTriangle[2] > SideOfTriangle[1] * SideOfTriangle[0]) {
            System.out.println(perimetrOfTriangle(SideOfTriangle));
            System.out.println(AreaOfTriangle(SideOfTriangle));
        }

    }

    public static int perimetrOfTriangle(int[] SideOfTriangle) {
        return SideOfTriangle[0] + SideOfTriangle[1] + SideOfTriangle[2];
    }

    public static double AreaOfTriangle(int[] SideOfTriangle) {
        return Math.sqrt(perimetrOfTriangle(SideOfTriangle) *
                (perimetrOfTriangle(SideOfTriangle) - SideOfTriangle[0]) *
                (perimetrOfTriangle(SideOfTriangle) - SideOfTriangle[1]) *
                (perimetrOfTriangle(SideOfTriangle) - SideOfTriangle[2]));
    }
}






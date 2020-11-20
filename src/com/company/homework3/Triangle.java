package com.company.homework3;

public class Triangle {
    private double SideA;
    double SideB;
    double SideC;

    public Triangle() {
    }

    public Triangle(double sideA, double sideB, double sideC) {
        SideA = sideA;
        SideB = sideB;
        SideC = sideC;
    }

    public double Triangleperimeter() {
        return SideA + SideB + SideC;
    }

    public double TriangleArea() {
        return Math.sqrt(((SideA + SideB + SideC) / 2) *
                (((SideA + SideB + SideC) / 2)) - SideA) * (((SideA + SideB + SideC) / 2) - SideB) *
                (((SideA + SideB + SideC) / 2) - SideC);
    }

    public double getSideA() {
        return SideA;
    }

    public void setSideA(double sideA) {
        SideA = sideA;
    }

    public double getSideB() {
        return SideB;
    }

    public void setSideB(double sideB) {
        SideB = sideB;
    }

    public double getSideC() {
        return SideC;
    }

    public void setSideC(double sideC) {
        SideC = sideC;
    }
}

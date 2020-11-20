package com.company.homework1;

public class Circle {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
    }

    public double calculateArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    public double calculatePerimeter() {
        return Math.PI * 2 * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

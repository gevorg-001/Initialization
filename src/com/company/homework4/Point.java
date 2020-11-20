package com.company.homework4;

public class Point {
    private double coordinateX;
    double coordinatey;
    double coordinateX1;
    double coordinatey1;

    public Point() {
    }

    public Point(double coordinateX, double coordinatey, double coordinateX1, double coordinatey1) {
        this.coordinateX = coordinateX;
        this.coordinatey = coordinatey;
        this.coordinateX1 = coordinateX1;
        this.coordinatey1 = coordinatey1;
    }

    public Point(double coordinateX, double coordinatey) {
        this.coordinateX = coordinateX;
        this.coordinatey = coordinatey;
    }

    public double distancFrom0_0Coordinate() {
        return Math.sqrt(Math.pow(coordinateX, 2) + Math.pow(coordinatey, 2));
    }

    public double distancePointPOint()
    {
        return Math.sqrt(Math.pow(coordinateX1 - coordinateX, 2) + Math.pow(coordinatey1 - coordinatey, 2));
    }


    public double getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public double getCoordinatey() {
        return coordinatey;
    }

    public void setCoordinatey(double coordinatey) {
        this.coordinatey = coordinatey;
    }

    public double getCoordinateX1() {
        return coordinateX1;
    }

    public void setCoordinateX1(double coordinateX1) {
        this.coordinateX1 = coordinateX1;
    }

    public double getCoordinatey1() {
        return coordinatey1;
    }

    public void setCoordinatey1(double coordinatey1) {
        this.coordinatey1 = coordinatey1;
    }
}

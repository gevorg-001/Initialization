package com.company.homework2;

public class Rectangle {
    private int height;
    int width;

    public Rectangle() {
    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int calculatePerimeter() {
        return 2 * (width + height);
    }

    public int calculateArea() {
        return width * height;
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}

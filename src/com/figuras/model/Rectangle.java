package com.figuras.model;

public class Rectangle {
    private int base;
    private int height;
    private int area;

    public Rectangle(int base, int height) {
        this.height = height;
        this.base = base;

    }

    public double getArea(){
        area = base * height;
        return area;
    }

    public void draw(){

        System.out.println("Rectángulo");
    }
}

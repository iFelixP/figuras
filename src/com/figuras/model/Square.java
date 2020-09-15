package com.figuras.model;

public class Square {
    private int side;
    private double area;

    public Square(int side) {
        this.side = side;
    }

    public double getArea() {
        area = Math.pow(side, 2);
        return area;
    }

    public void draw(){
        System.out.println("Cuadrado");
    }
}

package com.figuras.model;

public class Triangle {
    private int base;
    private int height;
    private float area;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        area = (base * height)/2;
        return area;
    }

    public void draw() {
        System.out.println("Triángulo");
    }
}

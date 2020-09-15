package com.figuras.model;

public class Circle {
    private int radio;
    private double area;

    public Circle(int radio){

        this.radio = radio;

    }

    public double getArea(){
        area = 3.1416 * (Math.pow(radio,2));
        return area;
    }

    public void draw(){

        System.out.println("Circulo");
    }

}

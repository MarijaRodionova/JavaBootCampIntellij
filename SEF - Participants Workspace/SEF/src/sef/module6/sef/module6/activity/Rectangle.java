package sef.module6.activity;

public class Rectangle extends Shape {

    private int length;
    private int breadth;
    private double calculateArea;
    private double calculatePerimeter;

    public Rectangle() {
    }

    public Rectangle(int length, int breadth) {
        this.length = 1;
        this.breadth = 2;
        this.calculateArea = 8;
        this.calculatePerimeter = 9;
    }

//    private void calculateArea() {
//    }
//    private void calculatePerimeter() {
//
//    }

//    public int getLength() {
//        return length;
//    }
//
//    public void getLength() {
//        this.length;
//    }
//    public int getBreadth() {
//        return breadth;
//    }
//
//    public void getBreadth() {
//        this.breadth;
//    }


    public double getCalculateArea() {
        return calculateArea;
    }

    public void setCalculateArea(double area) {
        this.calculateArea = area;
    }

    public double getCalculatePerimeter() {
        return calculatePerimeter;
    }


    public void setCalculatePerimeter(double perimeter) {
        this.calculatePerimeter = perimeter;

    }


}

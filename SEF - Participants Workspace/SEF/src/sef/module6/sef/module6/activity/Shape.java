package sef.module6.activity;

public class Shape {

	public String color;
	private Object calculatePerimeter;
	private double calculateArea;

	public Shape() {
		Shape shape = new Shape();
		shape.calculateArea();
		shape.calculatePerimeter();
	}

	private void calculateArea() {
	}
	private void calculatePerimeter() {

	}

	public double getCalculateArea() {
		return calculateArea;
	}

	public void setCalculateArea(double area) {
		this.calculateArea = area;
	}

	public double getCalculatePerimeter() {
		return calculateArea;
	}


	public void setCalculatePerimeter(double perimeter) {
		this.calculatePerimeter = perimeter;

	}

	// Complete the code and Add abstract method calculateArea() and calculatePerimeter() with return type as double

	
	public void setColor(String c) {
		color = c;
	}
	public String getColor() {
		return color;
	}




	
	

}

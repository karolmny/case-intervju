package com.evry.interview;

public class Triangle extends Figure {

	private double base;
	private double height;

	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	public Double getArea() {
		return base * height / 2;
	}

	public String getType() {
		return "Triangle";
	}

	public void setBase(double base) {
		this.base = base;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}

/*
 * The class triangle extends the class Figure
 * 	- meaning it has: - the public function print
 * 					  - has to decleare the abstract function getArea
 * 					  - has the protected function getType() 
 * 
 * The class overwrites the getType() function so it will return Trianle, and not squre
 * This will also change that the function print() return 
 * 
 * The abstract function getArea() is implemented
 * Returns the area of a triangle, based on the class variables base and height
 * 
 * the public function Triangle is a constructor and sets the privat variables
 * 
 * The setBase and setHeight functions is to change the private variables
 * 
 * ----
 * Possible changes:
 * getBase() and getHeight() that makes the private variables accessable 
 * 			 
 * 
 * 
 */
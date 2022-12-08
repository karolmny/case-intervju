package com.evry.interview;

public class Square extends Figure {

	private double base;

	public Square(double base) {
		this.base = base;
	}

	public Double getArea() {
		return base * base;
	}

	public void setBase(double base) {
		base = base;
	}

}

/* 
 * This class is almost the same as the tringle class
 * 
 * the setBase(..) does the same as the setBase(..) for the triangle class
 * 
 * the getArea() returns the area given by the function for kvadrat 
 * 
 * Has the priate variable base, same as traingle
 * 
 * 
 * 
 */

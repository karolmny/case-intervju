/**
 * 
 */
package com.evry.interview;

public abstract class Figure implements Printable{

	public void print() {
		System.out.println(getType() + " Area = " + getArea());
	}
	
	public abstract Double getArea();
	
	protected String getType() {
		return "Square";
	}
	
}



/*
 *  Figure is a abstract class that inherrits from the interface Printable 
 * 	- ref keyword implements
 * 
 * 	The method print was a abstract method and has to be implemented by Figure
 *  The method prints gettype() Area = getArea()
 * 
 *  The class implements a new abstract function - getArea()
 *  This fucntion returns a Dobule
 * 
 * 	The class creates a non-abstract but protected function gettype. 
 * 	For a Figure class it will return  write Squre 
 * 	- is only accesseble within the class and subclasses
 * 
 * 
 */
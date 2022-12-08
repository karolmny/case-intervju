package com.evry.interview;

import java.util.Comparator;


public class FigureComparator implements Comparator<Object> {

	public int compare(Object object1, Object object2) {
		Figure figure1 = (Figure)object1;
		Figure figure2 = (Figure)object2;
		
		int result = 0;
		if(figure1 != null && figure2 != null) 	
			result = figure2.getArea().compareTo(figure1.getArea());
		
		return result;
	}
	
}

/*
 * The Comparator is an interface class (ref implemnts)
 * The <0bject> says the kind of objecs that is beeing compared
 * 
 * Defines figure1 by making object1 a figure
 * same for figure2
 * 
 * First it checks if figure1 and figure2 is not null
 * Checks if the area of figure1 is equal to figure2
 * 
 * returns negative, zero, postive
 * negative = figure2.getArea() > figure1.getArea()
 * zero = figure2.getArea() = figure1.getArea()
 * positive = figure2.getArea() < figure2.getArea()
 * 
 * 
 * ------ 
 * We have a problem with result being initalized to zero
 * - returns zero both when the areas are the same and when one, or both, are null
 * 
 * and only two objects 
 * 
 * but maybe sort - that uses the FigureComparator - when it gets zero it does not sort? 
 * since it figure1 or figure2 is null, it mean that we are at the end or beginning? 
 * 
 */

package com.evry.interview;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class TestCase {

	SomeHelperClass someHelperClass = new SomeHelperClass();

	public static void main(String[] args) {

		TestCase testCase = new TestCase();

		try {
			testCase.getAll();
		} catch (Exception e) {
		} finally {
			testCase = null;
		}

	}

	public void getAll() throws SystemException {

		List list = null;

		list = someHelperClass.getFigures();
		if (list.get(0) != null) {
			if (list.get(0) instanceof Triangle) {
				Triangle t1 = (Triangle) list.get(0);
				t1.setBase(1);
				t1.setHeight(1);
			} else if (list.get(0) instanceof Square) {
				Square s1 = (Square) list.get(0);
				s1.setBase(1);
			}

		} else {
			throw new SystemException("Empty list");
		}

		FigureComparator comparator = new FigureComparator();
		sortList(list, 1, comparator);

		Iterator iter = list.iterator();
		while (iter.hasNext()) {
			Figure figure = (Figure) iter.next();
			figure.print();
		}

	}

	public List sortList(List list, int sortChoise, Comparator comparator) {

		switch (sortChoise) {

		case 1:
			someHelperClass.sort(list, 1, comparator);
			break;

		default:
			someHelperClass.sort(list, 2, comparator);
			break;
			
		case 2:
			someHelperClass.sort(list, 2, comparator);
			
		case 3:
			someHelperClass.sort(list, 3, comparator);
			break;
		}

		return list;
	}

}



/*
 * getAll() function
 *  initalizes list as a list with null objects
 * 	overwrites list with somehelperClass.getFigures()
 * 
 * checks if the first element of the List is a triangle (it is not) and then a squre (it is)
 * -> creates a s1 = square(1) -> 1
 * 
 * Creates a FigureComparator 
 * calls sortlist(list,1,comparator)
 * 
 * sortList() method
 *  -> sortchice = 1
 *  this means that we are sorting ascending
 * 
 * accumes pass by copy -> i.e square1 is notoverwritten
 * 
 * * Square 3      -> 9
 * Traingle(2,3) -> 3
 * Squre(2)      -> 4
 * Triangle(2,2) -> 2
 * Triangle(2,6) -> 6
 * 
 * 
 * Triangle(2,2) -> 2
 * Traingle(2,3) -> 3
 * Squre(2)      -> 4
 * Triangle(2,6) -> 6
 * Square 3      -> 9
 * 
 * Triangle Area = 2
 * Triangle Area = 3
 * Square Area = 4
 * Triangle Area = 6
 * Square Area = 9
 * Empty list
 * 
 * ---
 * Qustions 
 * should case 2 in the switch has a break? If sortChoise we will run case 2 and 3
 * does Java juse pass by reference og pass by copy? 
 * - because then s1 and t1 will overwrite 
 * 
 * does list.get(0) remove it from the list? 
 *  
 */
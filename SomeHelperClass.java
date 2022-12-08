package com.evry.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SomeHelperClass {

	/*
	 * Sort constants
	 */
	public static int SORT_ASCENDING = 1;
	public static int SORT_NOTHING = 2;
	public static int SORT_DESCENDING = 3;

	/*
	 * Context for exceptions from helper
	 */
	public static final String CONTEXT = SomeHelperClass.class.getName();

	/**
	 * Retrieves a list of figures
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<Figure> getFigures() throws SystemException {

		List<Figure> list = new ArrayList<Figure>();
		list.add(new Square(3));
		list.add(new Triangle(2, 3));
		list.add(new Square(2));
		list.add(new Triangle(2, 2));
		list.add(new Triangle(2, 6));

		if (list.isEmpty()) {
			throw new SystemException("Empty list", CONTEXT);
		}
		return list;
	}

	/**
	 * Sorts the list depending on incoming sort choice
	 * 
	 * @param list
	 * @param sortChoice
	 */
	public void sort(List<Integer> list, int sortChoice,
			Comparator<Object> figureComparator) {
		if (sortChoice == SORT_DESCENDING) {
			Collections.sort(list, figureComparator);

		} else if (sortChoice == SORT_NOTHING) {
			// Leave list unsorted

		} else if (sortChoice == SORT_ASCENDING) {
			Collections.sort(list, figureComparator);
			Collections.reverse(list);
		}
	}

}


/*
 * Public class with three public variables defining some sorting 
 * 
 * 
 * getFigures() get a list of figures and throws a SystemExpection
 * 
 * Square 3      -> 9
 * Traingle(2,3) -> 3
 * Squre(2)      -> 4
 * Triangle(2,2) -> 2
 * Triangle(2,6) -> 6
 * 
 * Checks if the list is empty by throwing a systemExpection
 * 
 * method sort
 *  	
 * 
 * 
 * TODOS
 * 
 * SomeHelperClass.class.getName(); ?
 * 
 * find out how the collections.sort(list, figureComparator ) works
 *  
 */
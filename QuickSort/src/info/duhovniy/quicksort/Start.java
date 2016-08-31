package info.duhovniy.quicksort;

import java.util.Date;

public class Start {
	
	public static void main(String[] args) {
		// parameters - length of array, maximum integer in array
		QuickSort test = new QuickSort(10000, 10000);
		System.out.println(test);
		Date date = new Date();
		long start = date.getTime();
		test.doQuickSort();
		System.out.println(test);
		date = new Date();
		long stop = date.getTime();
		System.out.println("Sorting time " + (stop - start) + "ms");
	}

}

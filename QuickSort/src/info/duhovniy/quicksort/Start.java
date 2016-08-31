package info.duhovniy.quicksort;

import java.util.Date;

public class Start {
	
	public static void main(String[] args) {
		// parameters - length of array, maximum integer in array
		QuickSort test = new QuickSort(10000, 10000);
		System.out.println(test);
		long start = (new Date()).getTime();
		test.doQuickSort();
		System.out.println(test);
		System.out.println("Sorting time " + ((new Date()).getTime() - start) + "ms");
	}

}

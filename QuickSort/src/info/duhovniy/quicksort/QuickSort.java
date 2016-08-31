package info.duhovniy.quicksort;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
	private int array[];
	private int max;

	public QuickSort(int length, int max) {
		array = new int[length];
		this.max = max;
		randomFill();
	}
	
	public String getTestString() {
		return array.toString();
	}
	
	public void doQuickSort() {
		quickSort(array, 0, array.length - 1);
	}

	private int partition(int arr[], int left, int right) {
		int i = left, j = right;
		int tmp;
		int pivot = arr[(left + right) / 2];

		while (i <= j) {
			while (arr[i] < pivot)
				i++;
			while (arr[j] > pivot)
				j--;
			if (i <= j) {
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			}
		}
		return i;
	}

	private void quickSort(int arr[], int left, int right) {
		int index = partition(arr, left, right);
		if (left < index - 1)
			quickSort(arr, left, index - 1);
		if (index < right)
			quickSort(arr, index, right);
	}

	private void randomFill() {
		Random rand = new Random();
	    
		for(int i = 0; i < array.length; i++)
//			array[array.length - i - 1] = i;
	        array[i] = rand.nextInt(max);
	}

	@Override
	public String toString() {
		return Arrays.toString(array);
	}
	
}

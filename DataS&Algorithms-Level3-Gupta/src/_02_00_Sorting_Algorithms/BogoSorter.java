package _02_00_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	Random r = new Random();
	public BogoSorter() {
		type = "Bogo";
	}
	
	// Bogo sort is a joke sorting algorithm. It is considered the most 
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.
	
	// It works by following these steps:
	// STEP 1. Is the array in order?
	//	if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.
	
	//1. Complete the sort method using the Bogo sort algorithm. 
	void sort(int[] array, SortingVisualizer display) {
		
		
		while (!isSorted(array)) {
			int r1 = new Random().nextInt(array.length);
			int r2 = new Random().nextInt(array.length);
			int temp = array[r1];
			array[r1] = array[r2];
			array[r2] = temp;
			display.updateDisplay();
		}
	}
		
	boolean isSorted(int[] array) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					return false;
				}
			}
			return true;
		}
}
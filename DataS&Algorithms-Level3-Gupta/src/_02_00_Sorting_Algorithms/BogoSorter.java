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
	@Override
	void sort(int[] a, SortingVisualizer display) {
		for (int i = 1; i < a.length; i++) {
			if(a[i] < a[i-1]) {
				int rand1 = a[r.nextInt(a.length)];
				int rand2 = a[r.nextInt(a.length)];
				final int og = rand1;
				
				rand1 = rand2;
				rand2 = og;
			}
		}
	}
}

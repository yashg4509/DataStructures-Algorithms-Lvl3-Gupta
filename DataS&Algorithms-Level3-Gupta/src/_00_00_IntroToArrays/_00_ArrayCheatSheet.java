package _00_00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		Random r = new Random();
		// 1. make an array of 5 Strings COMPLETE
		String[] array = { "Eric", "is", "a", "cool", "kid" };
		// 2. print the third element in the array COMPLETE
		System.out.println(array[2]);
		System.out.println();
		// 3. set the third element to a different value COMPLETE
		array[2] = "the";
		// 4. print the third element again COMPLETE
		System.out.println(array[2]);
		System.out.println();
		// 5. use a for loop to set all the elements in the array to a string of your
		// choice COMPLETE
		for (int i = 0; i < array.length; i++) {
			array[i] = "lit";
		}
		// 6. use a for loop to print all the values in the array COMPLETE
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println();
		// 7. make an array of 50 integers
		int[] intArray;
		intArray = new int[50];
		// 8. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = r.nextInt(100);
		}
		// 9. without printing the entire array, print only the smallest number on the
		// array
		int smallest = intArray[0];
		for (int i : intArray) {
			if (i < smallest) {
				smallest = i;
			}
		}
		System.out.println(smallest);
		System.out.println();
		// 10 print the entire array to see if step 8 was correct
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		System.out.println();
		// 11. print the largest number in the array.
		int largest = intArray[0];
		for (int i : intArray) {
			if (i > largest) {
				largest = i;
			}
		}
		System.out.println(largest);
		System.out.println();
		// 12. print only the last element in the array
		int size = intArray.length;
		System.out.println(intArray[size - 1]);
	}
}

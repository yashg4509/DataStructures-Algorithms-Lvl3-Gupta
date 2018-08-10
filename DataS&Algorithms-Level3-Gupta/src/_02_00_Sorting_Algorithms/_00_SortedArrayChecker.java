package _02_00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	public static void main(String[] args) {

		int[] testInt = {6, 5, 4, 3, 2, 1}, testNotInt = {2, 4, 7, 1, 3};
		double[] testDouble = {6.0, 5.0, 4.0, 3.0, 2.0, 1.0}, testNotDouble = {2.8, 1.2, 4.7, 8.2, 5.4};
		char[] testChar = {'e', 'd', 'c', 'b', 'a'}, testNotChar = {'a', 'd', 'b', 'z', 'e'}; 
		String[] testStr = {"f", "e", "d", "c", "b", "a"}, testNotStr = {"d", "f", "x", "y", "z"};
		
		System.out.println(_00_SortedArrayChecker.intArraySorted(testInt)); 
		System.out.println(_00_SortedArrayChecker.intArraySorted(testNotInt));
		System.out.println(_00_SortedArrayChecker.doubleArraySorted(testDouble));
		System.out.println(_00_SortedArrayChecker.doubleArraySorted(testNotDouble));
		System.out.println(_00_SortedArrayChecker.charArraySorted(testChar));
		System.out.println(_00_SortedArrayChecker.charArraySorted(testNotChar));
		System.out.println(_00_SortedArrayChecker.stringArraySorted(testStr));
		System.out.println(_00_SortedArrayChecker.stringArraySorted(testNotStr));
	}
	
	//1. Write a static method called intArraySorted. 
	//   This method takes in an array of integers
	//   and it returns a boolean.
	//   The method returns true if the integer
	//   array is in ascending order and false otherwise
	static boolean intArraySorted(int[] a) {
		for (int i = 1; i < a.length; i++) {
			if(a[i] > a[i-1]) {
				return false;
			}
		}
		
		return true;
	}
	
	//2. Write a static method called doubleArraySorted. 
	//   This method takes in an array of doubles
	//   and it returns a boolean.
	//   The method returns true if the double
	//   array is in ascending order and false otherwise
	static boolean doubleArraySorted(double[] a) {
		for (int i = 1; i < a.length; i++) {
			if(a[i] > a[i-1]) {
				return false;
			}
		}
		
		return true;
	}
	
	//3. Write a static method called charArraySorted. 
	//   This method takes in an array of characters
	//   and it returns a boolean.
	//   The method returns true if the character
	//   array is in alphabetical order and false otherwise
	//   (You can compare characters just like integers)
	static boolean charArraySorted(char[] c) {
		for (int i = 1; i < c.length; i++) {
			if(c[i] > c[i-1]) {
				return false;
			}
		}
		
		return true;
	}
	
	//4. Write a static method called stringArraySorted. 
	//   This method takes in an array of Strings
	//   and it returns a boolean.
	//   The method returns true if the String
	//   array is in alphabetical order and false otherwise
	//   (Use the compareTo(String) method)
	static boolean stringArraySorted(String[] s) {
		for (int i = 1; i < s.length; i++) {
			if((s[i].compareTo(s[i-1]) > 0)) {
				return false;
			}
		}
		
		return true;
	}
}

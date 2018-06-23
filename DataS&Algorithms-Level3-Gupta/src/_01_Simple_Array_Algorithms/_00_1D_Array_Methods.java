package _01_Simple_Array_Algorithms;

public class _00_1D_Array_Methods {
	//1. Complete the method so that it returns the sum of all
	//   of the integers in the array being passed in
	static int sumIntArray(int[] values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		
		System.out.println(sum);
		return sum;
	}
	
	//2. Complete the method so that it returns the average of all
	//   of the integers in the array being passed in
	static double averageIntArray(int[] values) {			
		int sum = 0;
		double average = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
			average = sum/values.length;
		}
		
		System.out.println(average);
		return average;	
	}
	
	
	//3. Complete the method so that it returns true if the integer
	//   array contains the value specified by the second parameter.
	//   It should otherwise return false.
	static boolean containsIntValue(int[] array, int value) {
		boolean x = false;
		for (int i = 0; i < array.length; i++) {
			if(array[i] == value) {
				x = true;
				System.out.println(x);
				return x;
			}
		}
		
		return false;
	}
	
	//4. Complete the method so that it returns the index of the,
	//   first instance that the specified value occurs in the array.
	//   If the array does not contain the specified value, it should return -1.
	static int getIndex(int[] arr, int value) {
		 for(int i = 0; i < arr.length; i++) {
		        if(arr[i] == value) {
		        	System.out.println(i);
		            return i;
		        }
		    }
		    return -1;
	}
	
	public static void main(String[] args) {
		int[] test = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		_00_1D_Array_Methods.sumIntArray(test);
		_00_1D_Array_Methods.averageIntArray(test);
		_00_1D_Array_Methods.containsIntValue(test, 6);
		_00_1D_Array_Methods.getIndex(test, 3);
		
	}
}

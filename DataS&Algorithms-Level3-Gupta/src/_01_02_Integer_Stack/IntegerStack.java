package _01_02_Integer_Stack;

public class IntegerStack {
	//1. create a private array of integers
	private int[] arr;
	//2. complete the constructor by initializing the member array
	//   to a new array of length 0. This prevents null pointer exceptions.
	public IntegerStack() {
		arr = new int[0];
	}
	
	//3. Complete the steps in the push method.
	public void push(int v) {
		//A. create a new array that is one element larger than the member array
		int[] new_array1 = new int[arr.length + 1];
		//B. set the last element of the new array equal to the integer passed into the method
		int size = new_array1.length;
		new_array1[size - 1] = v;
		//C. iterate through the member array and copy all the elements into the new array
		for (int i = 0; i < arr.length; i++) {
			new_array1[i] = arr[i];
		}
		//D. set the member array equal to the new array.
		arr = new_array1;
	}
	
	//4. Complete the steps in the pop method.
	public int pop() {
		//A. create an integer variable and initialize it to the
		//   last element of the member array.
		int popInt = arr[arr.length];
		//B. create a new array that is one element smaller than the member array
		int[] newIntArr = new int[arr.length - 1];
		//C. iterate through the new array and copy every element from the
		//   member array to the new array
		for (int i = 0; i < newIntArr.length; i++) {
			newIntArr[i] = arr[i];
		}
		//D. set the member array equal to the new array
		arr = newIntArr;
		//E. return the variable you created in step A
		return popInt;
	}
	
	//5. Complete the clear method to set the
	//   member array to a new array of length 0
	public void clear() {
		int[] clearArr = new int[0];
		arr = clearArr;
	}
	
	//6. Complete the size array to return 
	//   the length of the member array
	public int size() {
		return arr.length;
	}
}

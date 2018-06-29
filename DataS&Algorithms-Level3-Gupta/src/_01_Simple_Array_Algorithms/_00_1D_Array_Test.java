package _01_Simple_Array_Algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class _00_1D_Array_Test {

	@Test
	void testSum() {
		int[] arr = {0, 1, 2, 3, 4};
		assertEquals(10, _00_1D_Array_Methods.sumIntArray(arr));
		
		int[] arr2 = {-4, 1, 2, 1, -3};
		assertEquals(-3, _00_1D_Array_Methods.sumIntArray(arr2));
	}
	
	@Test
	void testAverage() {
		int[] arr = {0, 1, 2, 3, 4};
		assertEquals(2.0, _00_1D_Array_Methods.averageIntArray(arr), 0.001);

		int[] arr2 = {5, 3, 23, -6, 24};
		assertEquals(9.8, _00_1D_Array_Methods.averageIntArray(arr2), 0.001);
		
		int[] arr3 = {20, 1, -12, 93, -424};
		assertEquals(-64.4, _00_1D_Array_Methods.averageIntArray(arr3), 0.001);
		
	}
	
	@Test
	void testContains() {
		int[] arr = {0, 0, 0, 0, 0, 0, 0};
		assertTrue(_00_1D_Array_Methods.containsIntValue(arr, 0));

		int[] arr2 = {0, 0, 0, 0, 0, 0, 0};
		assertFalse(_00_1D_Array_Methods.containsIntValue(arr2, 1));
		
		int[] arr3 = {0, 1, 2, 3, 4};
		assertTrue(_00_1D_Array_Methods.containsIntValue(arr3, 4));
	}
	
	@Test 
	void testGetIndex(){
		int[] arr = {0, 0, 0};
		assertEquals(0, _00_1D_Array_Methods.getIndex(arr, 0));
		
		int[] arr2 = {1, 2, 3};
		assertEquals(2, _00_1D_Array_Methods.getIndex(arr2, 3));
		
		int[] arr3 = {0, 0, 0};
		assertEquals(-1, _00_1D_Array_Methods.getIndex(arr3, 1));
	}

}

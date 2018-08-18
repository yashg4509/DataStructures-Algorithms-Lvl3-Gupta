package _02_01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] s = {"cat", "dog", "rat", "chicken", "duck"};
		String v = "chicken";
		String v2 = "fish";
		String v3 = "cat";
		
		assertEquals(3, _00_LinearSearch.linearSearch(s, v));
		assertEquals(-1, _00_LinearSearch.linearSearch(s, v2));
		assertEquals(0, _00_LinearSearch.linearSearch(s, v3));
	}

	@Test
	void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] i = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		assertEquals(8, _01_BinarySearch.binarySearch(i, 0, 20, 8));
		assertEquals(-1, _01_BinarySearch.binarySearch(i, 0, 20, 100));
		assertEquals(18, _01_BinarySearch.binarySearch(i, 0, 20, 18));
	}
	
	@Test
	void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] in = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		assertEquals(7, _02_InterpolationSearch.interpolationSearch(in, 7));
		assertEquals(12, _02_InterpolationSearch.interpolationSearch(in, 12));
		assertEquals(-1, _02_InterpolationSearch.interpolationSearch(in, 52));
	}
	
	@Test
	void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] intt = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		assertEquals(0, _03_ExponentialSearch.exponentialSearch(intt, 0));
		assertEquals(-1, _03_ExponentialSearch.exponentialSearch(intt, 38));
		assertEquals(16, _03_ExponentialSearch.exponentialSearch(intt, 16));
		
	
	}
}

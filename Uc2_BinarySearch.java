package com.bridgelab.algorithm;

import java.util.Arrays;

public class Uc2_BinarySearchInteger {
	public static void main(String args[]) {

		int arr[] = { 10, 20, 30, 40, 50 };

		// To be find
		int key = 30;

		// By using Arrays.binarySearch()
		int result = Arrays.binarySearch(arr, key);

		if (result < 0)
			System.out.println("Element is not found!");
		else
			System.out.println("Element is found at index: " + result);
	}
}
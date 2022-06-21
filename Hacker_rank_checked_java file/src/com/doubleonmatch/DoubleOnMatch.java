package com.doubleonmatch;

import java.util.Arrays;
import java.util.Scanner;

public class DoubleOnMatch {
	public static void doubleSize(long[] arr, long num) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				num = num*2;
			}
		}
		
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter size of an array");
		int n = scanner.nextInt();
		
		long[] myArray = new long[n];
		
		System.out.println("Enter elements of an array");
		for (int i = 0; i < n; i++) {
			myArray[i] = scanner.nextLong();
		}
		
		System.out.println("Enter value of num to double");
		int num = scanner.nextInt();
		
		scanner.close();
		doubleSize(myArray, num);
	}
}

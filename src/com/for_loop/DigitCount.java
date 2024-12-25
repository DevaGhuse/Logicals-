package com.for_loop;

import java.util.Scanner;

public class DigitCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number to Count Digits: ");
		int a = sc.nextInt();
		int count = 0;

		// Convert the while loop to a for loop
		for (; a > 0; a /= 10) {
			count++;
		}

		System.out.println("Total Number of Digits are " + count);
	}
}

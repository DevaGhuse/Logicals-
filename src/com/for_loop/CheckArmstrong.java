package com.for_loop;

import java.util.Scanner;

public class CheckArmstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number: ");
		int a = sc.nextInt();
		int temp = a;
		int count = 0;
		int arm = 0;

		// Convert the first while loop to a for loop
		for (; temp > 0; temp /= 10) {
			count++;
		}

		temp = a;

		// Convert the second while loop to a for loop
		for (; temp > 0; temp = temp / 10) {
			int q = temp % 10;
			arm += Math.pow(q, count);
		}

		// Check if the Armstrong condition is met
		if (arm == a) {
			System.out.println(a + " is an Armstrong Number");
		} else {
			System.out.println(a + " is not an Armstrong Number");
		}
	}
}

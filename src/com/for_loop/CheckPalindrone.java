package com.for_loop;

import java.util.Scanner;

public class CheckPalindrone {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to Check: ");
		int a = sc.nextInt();
		int orignum = a;
		int rev = 0;

		// Convert the while loop to a for loop
		for (; a > 0; a /= 10) {
			int digit = a % 10;
			rev = (rev * 10) + digit;
		}

		if (rev == orignum) {
			System.out.println(orignum + " is a Palindrome Number");
		} else {
			System.out.println(orignum + " is Not a Palindrome Number");
		}
	}
}

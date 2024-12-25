package com.for_loop;

public class Pattern_6 {
	int n = 5;
	int x = 2;
	void pattern6() {
		for (int i = n; i >= 1; i--) {
			for (int j = n; j>= i; j--) {
				System.out.print(" " + x +  " ");
				x +=2;
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		Pattern_6 p6 = new Pattern_6();
		p6.pattern6();

	}
}
package com.for_loop;

public class Pattern_7 {
	void pattern7() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Pattern_7 p7 = new Pattern_7();
		p7.pattern7();

	}
}
package com.for_loop;

public class Pattern_2 {
	void pattern2() {
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}

	public static void main(String[] args) {
		Pattern_2 p2 = new Pattern_2();
		p2.pattern2();

	}
}
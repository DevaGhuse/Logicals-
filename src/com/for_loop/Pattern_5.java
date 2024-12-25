package com.for_loop;

public class Pattern_5 {
	void pattern5() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(j);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Pattern_5 p5 = new Pattern_5();
		p5.pattern5();

	}
}
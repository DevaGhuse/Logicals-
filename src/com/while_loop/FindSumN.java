package com.while_loop;

import java.util.Scanner;

public class FindSumN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to Find Sum: ");
        int a = sc.nextInt();
        int sum = 0;

        int i = 1; // Initialize the counter
        while (i <= a) {
            sum = sum + i;
            i++; // Increment the counter
        }

        System.out.println("The Sum of First " + a + " Natural Numbers is " + sum);
    }
}

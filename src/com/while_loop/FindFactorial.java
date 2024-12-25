package com.while_loop;

import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to Check: ");
        int a = sc.nextInt();
        long mul = 1;

        int i = 1; // Initialize the counter
        while (i <= a) {
            mul = mul * i;
            i++; // Increment the counter
        }
        System.out.println("The factorial of " + a + " is " + mul);
    }
}

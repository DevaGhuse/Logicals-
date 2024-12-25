package com.while_loop;

import java.util.Scanner;

public class Fibonacci {
    Scanner sc = new Scanner(System.in);

    int n1 = 0;
    int n2 = 1;
    int n3 = 0;

    void checkFibonacci() {
        System.out.println("Enter length of Series: ");
        int num = sc.nextInt();

        int i = 0; // Initialize the counter
        while (i <= num) {
            System.out.println(n1);

            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            i++; // Increment the counter
        }
    }
}

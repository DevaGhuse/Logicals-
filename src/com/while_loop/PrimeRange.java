package com.while_loop;

import java.util.Scanner;

public class PrimeRange {
    void checkPrimeRange() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range to Check");
        int n = sc.nextInt();
        int i = 1;
        
        while (i <= n) {  // Loop through numbers from 1 to n
            int count = 0;
            int j = 1;
            
            while (j <= i) {  // Check if the number 'i' is divisible by any number from 1 to i
                if (i % j == 0) {
                    count++;
                }
                j++;  // Increment 'j' to check the next number
            }
            
            if (count == 2) {
                System.out.println(i);  // If 'i' has exactly two divisors, it's a prime number
            }
            i++;  // Increment 'i' to check the next number
        }
    }
}

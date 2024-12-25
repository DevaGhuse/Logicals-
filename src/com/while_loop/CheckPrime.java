package com.while_loop;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to Check: ");
        int a = sc.nextInt();
        int count = 0;
        int i = 1;

        while (i <= a) {
            if (a % i == 0) {
                count++;
            }
            i++;
        }

        if (count == 2) {
            System.out.println(a + " is a Prime Number");
        } else {
            System.out.println(a + " is Not a Prime Number");
        }
    }
}

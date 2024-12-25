package com.while_loop;

import java.util.Scanner;

public class ReverseArray {
    int size;
    int[] a;

    void reverseArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        size = sc.nextInt();
        a = new int[size];
        System.out.println("Enter the elements of the array: ");
        int i = 0;

        // Populate the array using while loop
        while (i < size) {
            a[i] = sc.nextInt();
            i++;
        }

        // Reverse and print the array using while loop
        i = a.length - 1;
        System.out.println("Reversed Array: ");
        while (i >= 0) {
            System.out.println(a[i]);
            i--;
        }
    }
}

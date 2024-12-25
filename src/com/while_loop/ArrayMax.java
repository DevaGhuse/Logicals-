package com.while_loop;

import java.util.Scanner;

public class ArrayMax {
    int size;
    int[] a;
    int max = 0;

    void arrayMax() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        size = sc.nextInt();
        a = new int[size];

        System.out.println("Enter the elements of the array: ");
        int i = 0;
        while (i < size) {
            a[i] = sc.nextInt();
            i++;
        }

        int k = 0;
        while (k < a.length) { // Print Max Element
            if (a[k] > max) {
                max = a[k];
            }
            k++;
        }

        System.out.println("Max Element of Array is " + max);
    }
}

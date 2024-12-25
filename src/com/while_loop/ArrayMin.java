package com.while_loop;

import java.util.Scanner;

public class ArrayMin {
    int size;
    int[] a;
    int min;

    void arrayMin() {
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
        
        // Initialize `min` with the first element of the array
        min = a[0];
        
        int k = 0;
        while (k < a.length) { // Find the Minimum Element
            if (a[k] < min) {
                min = a[k];
            }
            k++;
        }
        
        System.out.println("Min Element of Array is " + min);
    }
}

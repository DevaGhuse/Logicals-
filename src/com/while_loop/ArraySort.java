package com.while_loop;

import java.util.Scanner;

public class ArraySort {
    int size;
    int[] a;
    int sort = 0;

    void arraySort() {
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

        System.out.print("Original Array is: ");
        i = 0;
        while (i < a.length) {
            System.out.print(a[i] + " ");
            i++;
        }

        i = 0;
        while (i < a.length) {
            int j = i + 1;
            while (j < a.length) {
                if (a[j] < a[i]) {
                    sort = a[i];
                    a[i] = a[j];
                    a[j] = sort;
                }
                j++;
            }
            i++;
        }

        System.out.print("\nSorted Array is: ");
        i = 0;
        while (i < a.length) {
            System.out.print(a[i] + " ");
            i++;
        }
    }
}

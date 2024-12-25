package com.while_loop;

public class Pattern_1 {
    void pattern() {
        int i = 0;  // Initialize outer loop variable
        while (i < 10) {  // Outer loop condition
            int j = 0;  // Initialize inner loop variable
            while (j < i) {  // Inner loop condition
                System.out.print(i);
                j++;  // Increment inner loop variable
            }
            System.out.println();  // Move to the next line after inner loop
            i++;  // Increment outer loop variable
        }
    }

    public static void main(String[] args) {
        Pattern_1 p1 = new Pattern_1();
        p1.pattern();
    }
}

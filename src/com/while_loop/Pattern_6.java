package com.while_loop;

public class Pattern_6 {
    int n = 5;
    int x = 2;

    void pattern6() {
        int i = n;  // Initialize the outer loop variable
        while (i >= 1) {  // Outer loop condition
            int j = n;  // Initialize the inner loop variable
            while (j >= i) {  // Inner loop condition
                System.out.print(" " + x + " ");
                x += 2;  // Increment x by 2
                j--;  // Decrement inner loop variable
            }
            System.out.println(" ");
            i--;  // Decrement outer loop variable
        }
    }

    public static void main(String[] args) {
        Pattern_6 p6 = new Pattern_6();
        p6.pattern6();
    }
}

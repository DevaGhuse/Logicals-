package com.while_loop;

public class Pattern_3 {
    void pattern3() {
        int i = 5;  // Initialize outer loop variable
        while (i >= 0) {  // Outer loop condition
            int j = 0;  // Initialize inner loop variable
            while (j < i) {  // Inner loop condition
                System.out.print("*");
                j++;  // Increment inner loop variable
            }
            System.out.println("*");  // Print last "*" in each row
            i--;  // Decrement outer loop variable
        }
    }

    public static void main(String[] args) {
        Pattern_3 p3 = new Pattern_3();
        p3.pattern3();
    }
}

package com.while_loop;

public class Pattern_7 {
    void pattern7() {
        int i = 1;  // Initialize the outer loop variable
        while (i <= 5) {  // Outer loop condition
            int j = 5;  // Initialize the inner loop variable
            while (j >= i) {  // Inner loop condition
                System.out.print(i);
                j--;  // Decrement inner loop variable
            }
            System.out.println();
            i++;  // Increment outer loop variable
        }
    }

    public static void main(String[] args) {
        Pattern_7 p7 = new Pattern_7();
        p7.pattern7();
    }
}

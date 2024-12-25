package com.while_loop;

public class Pattern_2 {
    void pattern2() {
        int i = 0;  // Initialize outer loop variable
        while (i <= 5) {  // Outer loop condition
            int j = 0;  // Initialize inner loop variable
            while (j < i) {  // Inner loop condition
                System.out.print("*");
                j++;  // Increment inner loop variable
            }
            System.out.println("*");  // Print last "*" in each row
            i++;  // Increment outer loop variable
        }
    }

    public static void main(String[] args) {
        Pattern_2 p2 = new Pattern_2();
        p2.pattern2();
    }
}

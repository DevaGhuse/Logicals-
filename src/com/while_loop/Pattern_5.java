package com.while_loop;

public class Pattern_5 {
    void pattern5() {
        int i = 1;  // Initialize the outer loop variable
        while (i <= 5) {  // Outer loop condition
            int j = 1;  // Initialize the inner loop variable
            while (j < i) {  // Inner loop condition
                System.out.print(j);
                j++;  // Increment the inner loop variable
            }
            System.out.println(i);  // Print the current value of i
            i++;  // Increment the outer loop variable
        }
    }

    public static void main(String[] args) {
        Pattern_5 p5 = new Pattern_5();
        p5.pattern5();
    }
}

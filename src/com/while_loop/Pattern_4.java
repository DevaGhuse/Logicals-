package com.while_loop;

public class Pattern_4 {
    void patter4() {
        char i = 'A';  // Initialize outer loop variable
        while (i <= 'E') {  // Outer loop condition
            char j = 'A';  // Initialize inner loop variable
            while (j <= 'E') {  // Inner loop condition
                System.out.print(i);
                j++;  // Increment inner loop variable
            }
            System.out.println(" ");  // Print newline after each row
            i++;  // Increment outer loop variable
        }
    }

    public static void main(String[] args) {
        Pattern_4 p4 = new Pattern_4();
        p4.patter4();    
    }
}

package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        //integer N and a tolerance level L
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        System.out.print("Enter the tolerance level: ");
        double tolerance_level = input.nextDouble();

        sqrt(number, tolerance_level);
    }
    private static void sqrt(double n, double l) {
        // Assuming the sqrt of n as n only
        double x = n;
        double root;
        int count = 0;
        while (true)
        {
            count++;
            // Calculate more closed x
            root = 0.5 * (x + (n / x));
            // Check for closeness
            if (Math.abs(root - x) < l)
                break;
            // Update root
            x = root;
        }
        System.out.println("Output of the number using Newton's Method is: " +root);
    }
}

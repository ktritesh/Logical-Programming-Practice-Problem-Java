package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int rev = reverse(n);
        System.out.println("Reverse of "+n+" is "+rev);
        reverse(n);
    }

    static int reverse(int n){
        int rev=0;
        while (n!=0){
            int r=n%10;
            rev = rev*10+r;
            n=n/10;
        }
        return rev;
    }
}

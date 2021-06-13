package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find Fibonacci series");
        n=sc.nextInt();
        nTermFib(n);
    }
    static void nTermFib(int n){
        int f1=0, f2=1, f3;
        while(n>0){
            System.out.println(f1);
            f3=f1+f2;
            f1=f2;
            f2=f3;
            n--;
        }
    }
}

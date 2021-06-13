package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int no = sc.nextInt();

        boolean result = isPrime(no);
        if(result)
            System.out.println(no+" is prime number");
        else
            System.out.println(no+" is not prime number");
    }

    static boolean isPrime(int n){
        int i = 2;
        while (i<=n/2){
            if(n%i==0)
                return false;
            i++;
        }
        return true;
    }
}

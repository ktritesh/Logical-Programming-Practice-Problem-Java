package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the perfect number");
        int no=sc.nextInt();

        boolean res=isPerfect(no);
        if(res)
            System.out.println(no+" is perfect number");
        else
            System.out.println(no+" is not a perfect number");
    }
    static boolean isPerfect(int x){
        int sum=0, i=1;
        while (i<=x/2){
            if(x%i==0)
                sum=sum+i;
                i++;
        }
        return x==sum;
    }
}

package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] notes = new int[]{1000, 500, 100, 50, 10, 5, 2, 1};
        int[] noteCounter = new int[8];
        System.out.println("Enter the change to be returned by the Vending Machine: ");
        int amount = scanner.nextInt();
        int sizeOfArray = notes.length;

        countCurrency(amount, notes, sizeOfArray, noteCounter);
    }

    public static void countCurrency(int amount, int notes[], int sizeOfArray, int noteCounter[]) {
        for (int i = 0; i < sizeOfArray; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                countCurrency(amount - noteCounter[i] * notes[i], notes, sizeOfArray, noteCounter);
                return;
            }
        }
        System.out.println("Currency Count ->");
        for (int i = 0; i < sizeOfArray; i++) {
            if (noteCounter[i] != 0) {
                System.out.println("Rs. " + notes[i] + " : " + noteCounter[i] + " in count.");
            }
        }
    }
}


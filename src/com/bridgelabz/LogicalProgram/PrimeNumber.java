package com.bridgelabz.LogicalProgram;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) ;
        if (num % 10 == 0) {
            System.out.println("The given number is Prime Number");
        } else {
            System.out.println("The given number is not Prime Number");

        }
    }
}



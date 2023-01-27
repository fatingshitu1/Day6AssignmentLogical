package com.bridgelabz.LogicalProgram;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Series");
        int series = scanner.nextInt();
        int x =0;
        int y = 1;
        int z;
        for (int i = 1; i < series; i++){
            System.out.println(x + " ");
            z = x+y;
            x=y;
            y=z;
        }
    }
}

package com.programming;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value the for n Fibonacci series (n) :");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int sum;

        System.out.print(a);
        for (int i = 1; i < n; ++i) {

            sum = a + b;
            System.out.print(", " + b);
            a = b;
            b = sum;

        }
    }
}

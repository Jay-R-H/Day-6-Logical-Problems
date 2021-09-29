package com.programming;

import java.util.Scanner;

public class ReverseTheNumber {

    public static void main(String[] args) {
//	take a number input from the user that need to be reversed
//        then remove each digit and place it in the new variable
//        new variable will give the reversed number

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number that need to be reversed :");
        int num = sc.nextInt();
        int reverse = 0;

        while (num !=0){
            int remainder = num % 10;
            num=num/10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println(reverse);
    }
}

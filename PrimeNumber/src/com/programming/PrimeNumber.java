package com.programming;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to be tested for prime numbers :");
        int num = sc.nextInt();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println(num + " is not a prime number");
                break;
            }
            if (num % i != 0) {
                System.out.println(num + " is a prime number");
                break;
            }
        }
    }
}


//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter the number of prime numbers to be listed (n) : ");
//            int n = sc.nextInt();
//            int i=2;
//            for (int number = 3; number < n; number++) {
//        while (number % i != 0){
//        System.out.println(number);
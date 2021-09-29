package com.programming;

import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for the number of coupons :");
        int num = sc.nextInt();
        int count = 0;
        int checkElement = 0;

        while (count != num) {
            int couponNumber = (random.nextInt());

            if (couponNumber > 0) {
                if (checkElement  != couponNumber) {
                    System.out.println(couponNumber);
                    count++;
                    checkElement=couponNumber;
                }
            }
        }
    }
}


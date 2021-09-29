package com.programming;

import java.util.Scanner;

public class StopWatch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 to start the stop-watch :");
        double start = sc.nextDouble();
        start = System.currentTimeMillis();

        System.out.println("Enter 0 to stop the stop-watch :");
        double stop = sc.nextDouble();
        stop = System.currentTimeMillis();

        double elapsedTime = (stop - start) / 1000;
        System.out.println(elapsedTime + " secs is the elapsed time ");
    }
}

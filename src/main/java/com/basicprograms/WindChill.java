package com.basicprograms;

import java.util.Scanner;

public class WindChill
{
    public static void main(String[] args) {
        System.out.println("Wind Chill");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Temperature");
        int t = scanner.nextInt();
        double w = 0;
        System.out.println("Enter Wind Speed");
        int v = scanner.nextInt();

        if (t > 50 || v > 120 || v < 3)
        {
            System.out.println("Input Invalid");
        }
        else
        {
            w = 35.74 + (0.6215 * t ) + ((0.4275 * t ) - 35.75 ) * Math.pow(v,0.16);
        }
        System.out.println("Wind Chill : " + w);
    }
}

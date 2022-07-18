package com.basicprograms;

import java.util.Scanner;

public class PowerOfTwo
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number of Times");
        int n = scanner.nextInt();
        PowerOfTwo power  = new PowerOfTwo();
        power.powerCalc(n);
    }

    public void powerCalc(int n)
    {
        for (int i = 0 ; i < n ; i++)
        {
            if (i < 32) {
                System.out.println("2 ^ " + i + " = " + (int) Math.pow(2, i));
            }
            else
            {
                System.out.println(i + "---- OverFlow");
            }
        }
    }
}

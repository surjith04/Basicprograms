package com.basicprograms;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeIntegers
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for ( int i = 0 ; i < n ; i++)
        {
            System.out.println("Enter number for position "+ i);
            a[i] = scanner.nextInt();
        }
        for ( int i = 0 ; i < n-2 ; i++)
        {
            for ( int j = i + 1 ; j < n-1 ; j++ )
            {
                for ( int k = j + 1 ; k < n ; k++)
                {
                    if ( a[i] + a[j] + a[k] == 0)
                    {
                        System.out.println(a[i] + " " + a[j] + " " + a[k]);
                    }
                }
            }
        }
    }
}

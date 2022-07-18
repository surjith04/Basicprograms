package com.basicprograms;

import java.util.Scanner;

public class LargeNumber
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Three Numbers");
        int a = scanner.nextInt();
        System.out.println("A -> " + a);
        int b = scanner.nextInt();
        System.out.println("B -> " + b);
        int c = scanner.nextInt();
        System.out.println("C -> " + c);
        if (a > b && a > c)
        {
            System.out.println("A is Greater");
        }
        else if (b > a && b > c)
        {
            System.out.println("B is Greater");
        }
        else
        {
            System.out.println("C is Greater ");
        }

    }
}

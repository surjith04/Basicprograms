package com.basicprograms;

import java.util.Scanner;

public class SwapNumber
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A");
        int a = scanner.nextInt();
        System.out.println("Enter B");
        int b = scanner.nextInt();
        System.out.println("----Before Swapping----");
        System.out.println("A : "+ a + " B : " + b);
        System.out.println("----After Swapping----");
        int temp;
        temp = a;
        a = b ;
        b = temp;
        System.out.println("A : "+ a + " B : " + b);

    }
}

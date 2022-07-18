package com.basicprograms;

import java.util.Scanner;

public class QuotientRemainder
{
    public static void main(String[] args) {
        System.out.println("Quotient And Remainder");
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------");
        System.out.println("Enter a Dividend");
        int dividend = scanner.nextInt();
        System.out.println("Enter a Divisor");
        int divisor = scanner.nextInt();

        System.out.println("----Output----");
        System.out.println("Quotient " + (dividend/divisor));
        System.out.println("Remainder " + (dividend%divisor));
    }
}

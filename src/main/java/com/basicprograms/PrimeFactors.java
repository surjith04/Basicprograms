package com.basicprograms;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> set = new LinkedHashSet<>();
        System.out.println("Enter A Number");
        int num = scanner.nextInt();

        for (int i = 2 ; i <= num ; i++)
        {
            while (num % i == 0)
            {
                set.add(i);
                num /= i;
            }
        }
        System.out.println("The Prime Factors are " + set);
    }
}

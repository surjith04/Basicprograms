package com.basicprograms;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HarmonicNumber
{
    public static void main(String[] args)
    {
        System.out.println("Harmonic Number");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the N Value");
        int n = scanner.nextInt();
        DecimalFormat df = new DecimalFormat("#.###");
        double h = 0.0;
        while(n > 0)
        {
            h += (double) 1 / n;
            n--;
            System.out.print(h +"  ");
        }
        System.out.println("");
        System.out.println("Output of Harmonic Series is "+df.format(h));
    }

}

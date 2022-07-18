package com.basicprograms;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Distance
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.#");
        System.out.println("Enter A Value");
        int x = scanner.nextInt();
        System.out.println("Enter B Value");
        int y = scanner.nextInt();
        System.out.println("Output : " + df.format(Math.sqrt((Math.pow(x,2))+(Math.pow(y,2)))));
    }
}

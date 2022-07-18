package com.basicprograms;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class FlipCoin
{
    public static void main(String[] args) {
        Random random = new Random();
        DecimalFormat df = new DecimalFormat("#.#");
        Scanner scanner = new Scanner(System.in);
        int tailsCount = 0;
        int headsCount = 0;
        System.out.println("Enter the Number of Flips ");
        int flips = scanner.nextInt();
        for (int i = 0; i < flips; i++) {
            String value = df.format(Math.random());
            if (Float.parseFloat(value) < 0.5) {
                tailsCount++;
            } else {
                headsCount++;
            }
        }
        System.out.println("Percentage of Tails " + ((tailsCount * 100 )/ flips) +"%");
        System.out.println("Percentage of Heads " + ((headsCount * 100)/ flips) +"%");
    }
}

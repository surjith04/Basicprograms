package com.basicprograms;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Quadratic
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.#");
        System.out.println("Enter Three Numbers");
        int a = scanner.nextInt();
        System.out.println("A -> " + a);
        int b = scanner.nextInt();
        System.out.println("B -> " + b);
        int c = scanner.nextInt();
        System.out.println("C -> " + c);
        double delta = Math.pow(b,2) - (4 * a * c);
        double root1 = (-(b) + Math.sqrt(delta))/(2 * a);
        double root2 = (-(b) - Math.sqrt(delta))/(2 * a);
        System.out.println(" Root 1 = "+ df.format(root1) + " Root 2 ="+ df.format(root2));
    }
}

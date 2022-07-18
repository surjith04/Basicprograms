package com.basicprograms;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Year");
        Integer year = scanner.nextInt();
        if (year % 4 == 0)
        {
            if(year % 100 == 0)
            {
                if(year % 400 == 0)
                {
                    System.out.println(year + "is Leap Year");
                }
                else
                {
                    System.out.println("Not a Leap Year");
                }
            }
            else
            {
                System.out.println(year + " is Leap Year");
            }

        }
        else
        {
            System.out.println("Not a Leap Year");
        }
    }
}

package com.basicprograms;

import java.util.Scanner;

public class Vowels
{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a Character");
        String ch = scanner.next();

        switch (ch)
        {
            case "a","e","i","o","u":
                System.out.println("Character is Vowel");
                break;
            default:
                System.out.println("Character is Consonant");
        }
    }
}

package com.basicprograms;

import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDimension
{
    public static void main(String[] args) {
        System.out.println("Two Dimensional Array");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter No.of.Rows");
        int row = scanner.nextInt();
        System.out.println("Enter No.of.Columns");
        int column = scanner.nextInt();
        int [][] array = new int[row][column];
        for ( int i = 0 ; i < row ; i++)
        {
            for ( int j = 0 ; j < column ; j++)
            {
                System.out.println("Enter Value for " + i + " row "+ j + " column ");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Two Dimension Array " + Arrays.deepToString(array));
    }
}

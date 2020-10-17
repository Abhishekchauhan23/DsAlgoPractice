package utils;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int number;
        double num;
        String m;
        /* Read and save an integer, double, and String to your variables.*/
        m=scan.nextLine();
        number=scan.nextInt();
        num=scan.nextDouble();

        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+number);
        /* Print the sum of the double variables on a new line. */
        System.out.println(d+num);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */

        System.out.print(s+m);
        // System.out.print(m);
        scan.close();
    }
}
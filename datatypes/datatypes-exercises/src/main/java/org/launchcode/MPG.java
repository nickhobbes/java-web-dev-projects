package org.launchcode;

import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven:");
        int miles = input.nextInt();

        System.out.println("How many gallons of gas have you burned:");
        float gallons = input.nextFloat();

        float mpg = (float) miles / gallons;
        System.out.println("You are getting " + mpg + " miles to the gallon.");

    }
}

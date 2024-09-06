package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double radius = 0;
        do {
            System.out.println("What is the radius: ");
            if(input.hasNextDouble()) {
                radius = input.nextDouble();
            }
            input.nextLine();
        } while (radius <= 0);

        double area = Circle.getArea(radius);
        System.out.println("The area of the circle is " + area);
    }
}
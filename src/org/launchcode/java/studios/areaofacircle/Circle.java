package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Circle {
    public static Double getArea(Double radius) {
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = input.nextDouble();
        input.close();
        return 3.14 * radius * radius;
    }
}

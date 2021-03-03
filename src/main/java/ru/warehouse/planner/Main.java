package ru.warehouse.planner;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        Text.NumberOfPoints();
        int numberOfPoint = scanner.nextInt();
        Point[] points=new Point[numberOfPoint];
        while(numberOfPoint > 0) {
            Text.TextForPoint(numberOfPoint);
            points[numberOfPoint-1]=new Point(scanner.nextDouble(), scanner.nextDouble());
            numberOfPoint--;
        }
        

    }
}

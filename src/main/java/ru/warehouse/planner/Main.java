package ru.warehouse.planner;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        Text.NumberOfPoints();
        int numberOfPoint = scanner.nextInt();

        Point[] points = new Point[numberOfPoint];
        while (numberOfPoint > 0) {
            Text.TextForPoint(numberOfPoint);
            points[numberOfPoint - 1] = new Point(scanner.nextDouble(), scanner.nextDouble());
            numberOfPoint--;
        }
        Text.WhatIsHightOfWarehouse();
        AnAreaCalculator SizeOfWarehouse = new AnAreaCalculator();
        //SizeOfWarehouse.SizeOfWarehouse(points, scanner.nextDouble());
        System.out.println(SizeOfWarehouse.SizeOfWarehouse(points,scanner.nextDouble()));
        Text.WhatIsTemperatureOfWarehouse();
        Text.WhatIsHumidityInWarehouse();

        Conditions conditionsForWarehous = new Conditions();
        conditionsForWarehous.ConditionsOfWarehouse(scanner.nextDouble(), scanner.nextInt());
        Conditions conditionsForProduct = new Conditions();

        Text.WhatIsTheSizeOfProduct();

        conditionsForProduct.Size(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());

        Text.WhatIsTemperatureForProduct();
        Text.WhatIsHumidityForProduct();
        Text.WhatIsData();

        conditionsForProduct.Data(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        conditionsForProduct.ConditionsOfProduct(scanner.nextDouble(), scanner.nextInt(), conditionsForProduct.Size, conditionsForProduct.data);


    }
}

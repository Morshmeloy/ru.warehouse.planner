package ru.warehouse.planner;

public class AnAreaCalculator extends Main {

    public double SizeOfWarehouse(Point[] points, double Hight) {
        double LenghtOfSegment = 1;
        double SizeOfWarehouse = 1;
        double[] arraySegment = new double[points.length];
        for (int i = 0; i < arraySegment.length; i++) {
            arraySegment[i] = LenghtOfSegment * Math.sqrt(Math.pow(points[i].X, 2) + Math.pow(points[i++].Y, 2));
            SizeOfWarehouse = SizeOfWarehouse * arraySegment[i];
        }
        SizeOfWarehouse = SizeOfWarehouse * Hight;
        return SizeOfWarehouse;
    }

}

package ru.warehouse.planner;

public class Rack {
    private final int length;

    private final int width;

    private final int height;

    private final int mass;

    public Rack(int length, int width, int height, int mass) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.mass = mass;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getMass() {
        return mass;
    }

    public int square() {
        return this.width * this.length;
    }
}

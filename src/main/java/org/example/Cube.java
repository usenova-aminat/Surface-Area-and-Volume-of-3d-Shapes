package org.example;

public class Cube implements Shape3DInterface {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double surfaceArea() {
        return 6 * side * side;
    }

    @Override
    public double volume() {
        return Math.pow(side, 3);
    }

    @Override
    public String toString() {
        return "Cube (side: " + side + ")";
    }
}

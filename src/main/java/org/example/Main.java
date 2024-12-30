package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Shape3DInterface> shapes = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            int shapeType = random.nextInt(3);
            switch (shapeType) {
                case 0 -> shapes.add(new Sphere(1 + random.nextDouble() * 9));
                case 1 -> shapes.add(new Cylinder(1 + random.nextDouble() * 9, 5 + random.nextDouble() * 15)); // Радиус от 1 до 10, высота от 5 до 20
                case 2 -> shapes.add(new Cube(1 + random.nextDouble() * 9));
            }
        }

        
        for (Shape3DInterface shape : shapes) {
            System.out.println(shape);
            System.out.printf("Surface Area: %.2f%n", shape.surfaceArea());
            System.out.printf("Volume: %.2f%n%n", shape.volume());
        }
    }
}
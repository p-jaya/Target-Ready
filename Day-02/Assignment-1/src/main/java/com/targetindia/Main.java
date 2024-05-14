package com.targetindia;

public class Main {
    public static void main(String[] args) {
        Circle[] circles = {
                new Cylinder(12.34),
                new Cylinder(12.34, 10.0),
                new Cylinder(12.34, 10.0,"blue")
        };

        for (int i = 0; i < circles.length; i++) {
            System.out.println("For circle " + i);
            System.out.println("Area = " + circles[i].getArea());
            if (circles[i] instanceof Cylinder) {
                System.out.println("Volume = " + ((Cylinder) circles[i]).getVolume());
            } else {
                System.out.println("Volume is not applicable for a regular Circle.");
            }
        }
    }
}

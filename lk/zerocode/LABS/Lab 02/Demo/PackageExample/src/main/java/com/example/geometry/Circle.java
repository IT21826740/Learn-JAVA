package com.example.geometry;

public class Circle {
    private static double PI = 3.14159;
    public static double calculateArea(double radius) {
        return PI * radius * radius;
    }
    public static double calculateCircumference(double radius) {
        return 2 * PI * radius;
    }

}

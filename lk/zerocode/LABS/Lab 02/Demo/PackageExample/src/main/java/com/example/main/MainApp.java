package com.example.main;

import com.example.geometry.Circle;
import com.example.shapes.Rectangle;
import com.example.strings.StringUtils;
import com.example.utility.MathUtils;

public class MainApp {
    public static void main(String[] args) {
        int sum = MathUtils.add(5,3);
        int difference =MathUtils.subtract(10,7);

        System.out.println("Sum: "+sum);
        System.out.println("Diffence: "+difference);

        int calculateArea = Rectangle.area(5,7);
        int calculatePerimeter = Rectangle.perimeter(5,7);

        System.out.println("Area: "+calculateArea);
        System.out.println("Perimeter: "+calculatePerimeter);

        String txtReverse = StringUtils.reverse("hello");
        String txtUppercase = StringUtils.uppercase("hello world");

        System.out.println("convert reverse: "+txtReverse);
        System.out.println("converte uppercase: "+txtUppercase);

        double radius =5.0;

        double area = Circle.calculateArea(radius);
        double circumference = Circle.calculateCircumference(radius);

        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);

    }
}

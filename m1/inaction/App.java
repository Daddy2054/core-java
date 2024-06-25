package com.codio;

import java.util.Scanner;
import com.codio.figures.Rectangle;

public class App {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        calculatePerimeter();
    }

    public static void calculatePerimeter() {
        System.out.println("Enter rectangle width => ");
        final String rawWidth = scanner.nextLine();

        System.out.println("Enter rectangle height => ");
        final String rawHeight = scanner.nextLine();

        try {
            final double width = Double.parseDouble(rawWidth);
            final double height = Double.parseDouble(rawHeight);
            final Rectangle rectangle = new Rectangle(width, height);
            System.out.println("Perimeter = " + rectangle.getPerimeter());
        } catch (NumberFormatException exception) {
            System.out.println("Wrong number " + exception.getMessage());
        }
    }
}

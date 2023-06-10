package org.fasttrackit;

import javax.swing.*;
import java.util.Scanner;

public class Measureable {
    public static final String TITLE = "- = Measurable Application = -";

    public static final String METER = "m";
    public static final String CENTIMETER = "cm";
    public static final String INCH = "in";
    public static final String FOOT = "ft";

    public static final String IMPERIAL_SYSTEM = "Imperial";
    public static final String METER_SYSTEM = "Meter";
    public static final double PI = 3.14;
    public static final int ONE_HUNDRED = 100;
    public static final String SQUARE_AREA = "Square Area";
    public static final String CIRCLE_AREA = "Circle Area";
    public static final String CUBE_VOLUME = "Cube Volume";
    public static Scanner input;

    public static void main(String[] args) {
        System.out.println(TITLE);

        String selectedSystem = METER_SYSTEM;
        String selectedUnit = METER;
        String selectedSubUnit = CENTIMETER;

        input = new Scanner(System.in);
        System.out.println("What International scale unit you prefer ?");
        System.out.println("i) " + IMPERIAL_SYSTEM);
        System.out.println("m) " + METER_SYSTEM);
        String unit = input.nextLine();
        if (unit.equals("i")) {
            selectedSystem = IMPERIAL_SYSTEM;
            selectedUnit = FOOT;
            selectedSubUnit = INCH;
        }
        System.out.println("You have chosen : " + selectedSystem + " system");

        System.out.println("In what unit is your measurement ?");
        System.out.println("1) " + selectedUnit);
        System.out.println("2) " + selectedSubUnit);
        String subUnitSelection = input.nextLine();

        System.out.println("What would you like to calculate ?");
        System.out.println("sa) " + SQUARE_AREA);
        System.out.println("ca) " + CIRCLE_AREA);
        System.out.println("cv) " + CUBE_VOLUME);
        String selectedFormula = input.nextLine();

        if (selectedFormula.equals("sa")) {
            System.out.println("You have chosen " + SQUARE_AREA + " formula.");
            String side = askForMeasurement("What is the side of the Square? : ");
            Double area = calculateArea(side, selectedFormula);
            if (area == null)
                return;

            area = transformInSubUnit(subUnitSelection, area);
            System.out.println("The area of the square is : " + area + " " + selectedUnit + "².");
        }
        if (selectedFormula.equals("ca")) {
            System.out.println("You have chosen " + CIRCLE_AREA + " formula.");
            String inputAsRadius = askForMeasurement("What is the radius of the Circle? : ");
            Double area = calculateArea(inputAsRadius, selectedFormula);
            if (area == null)
                return;
            area *= PI;
            area = transformInSubUnit(subUnitSelection, area);
            System.out.println("The area of the circle is : " + area + " " + selectedUnit + "².");
        }
        if (selectedFormula.equals("cv")) {
            System.out.println("You have chosen " + CUBE_VOLUME + " formula.");
            String side = askForMeasurement("What is the side of the Cube? :");
            Double area = calculateArea(side, selectedFormula);
            if (area == null)
                return;

            area = transformInSubUnit(subUnitSelection, area);
            System.out.println("The volume of cube is : " + area + " " + selectedUnit + ".");


        }
    }

    private static Double transformInSubUnit(String subUnitSelection, Double area) {
        if (subUnitSelection.equals("2")) {
            area = area / (ONE_HUNDRED * ONE_HUNDRED);
        }
        return area;
    }

    private static String askForMeasurement(String textToPrintToUser) {
        System.out.println(textToPrintToUser);
        return input.nextLine();
    }

    private static Double calculateArea(String s, String selectedFormula) {
        double number;
        try {
            number = Double.parseDouble(s);
        } catch (NumberFormatException e) {
            System.out.println("We can only measure using numbers. Letters are not allowed.");
            return null;
        }
        if (number < 0) {
            System.out.println("We can't calculate area of a negative number.");
            return null;
        }
        if (selectedFormula.equals("cv"))

        return number * number * number;
        else
            return number * number;
    }

}


// CTRL + ALT + M -> Extract Function / Extract Method ( same thing )
// CTRL + ALT + L -> Reformat file !

// What do we want to build in a measurable application ?
// -> Measure the area of a Square
// -> Measure the area of a Circle
// -> Measure the Volume of a Cube



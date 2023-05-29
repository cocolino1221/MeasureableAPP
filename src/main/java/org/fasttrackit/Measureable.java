package org.fasttrackit;

import javax.swing.border.TitledBorder;
import java.util.Scanner;
import java.io.InputStream;

public class Measureable {
    public static final String TITLE = " = Measureable Application = ";
    public static final String METER = "m";
    public static final String CENTIMETER = "cm";
    public static final String INCHES = "in";
    public static final String FOOT = "ft";

    public static void main(String[] args) {
        System.out.println(TITLE);
        Scanner input = new Scanner(System.in);
        System.out.println("What International unit do you prefer ? :");
        String unit = input.nextLine();
        System.out.println("you have chose : " +  unit  +  " system");

        String side = askForTheSideOfSquare(input);

        Double aria = calculateAria(side);
        if (aria == null)
            return;
        System.out.println("The aria of a the square is : " + aria);


    }

    private static String askForTheSideOfSquare(Scanner input) {
        System.out.print("What is the side of square ?  : ");
        String s = input.nextLine();
        return s;
    }

    private static Double calculateAria(String s) {
        double size;
        try {
             size = Double.parseDouble(s);
        } catch (NumberFormatException e) {
            System.out.println("We can only measure using numbers. letters are not allowed");
            return null;
        }
        if (size < 0) {
            System.out.println("We can't calculate area of a negative number! ");
            return null;
        }
        double aria =  size * size;
        return aria;
    }
}
// CTRl + ALT + M -> extract function
//What do we want to build in a
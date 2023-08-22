package org.launchcode;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?:");
        double milesDriven = input.nextDouble();

        System.out.println("How many gallons of gas have you used?:");
        double gasConsumed = input.nextDouble();

        double mpg = milesDriven / gasConsumed;

        System.out.println("You are running on " + mpg + " mpg.");
        input.close();
    }
}

// on step "D.Strings" of the exercise

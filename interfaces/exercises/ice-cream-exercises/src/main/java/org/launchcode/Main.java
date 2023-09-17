package org.launchcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        flavors.sort(new FlavorComparator());

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
        cones.sort(new ConeComparator());

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        for (Flavor flavor : flavors) {
            System.out.println(flavor.getName() + ": " + flavor.getAllergens());
        }

        for (Cone cone : cones) {
            System.out.println(cone.getName() + ": " + cone.getCost());
            }

        // TODO: Use a Comparator class to sort the "toppings" array in alphabetically by the 'name' field.
        toppings.sort(new ToppingComparator());

        // TODO: Print the 'toppings' list to verify the sorting.
        for (Topping topping : toppings) {
            System.out.println(topping.getName());
        }
        }
    }

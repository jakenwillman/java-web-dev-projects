package org.launchcode;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Menu {

    // FIELDS


    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;

    // Constructor

    // Getters & Setters

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    @Override
    public String toString() {
        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("appetizer")) {
                appetizers.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder burgers = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("burger")) {
                burgers.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder desserts = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("dessert")) {
                desserts.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder sandwiches = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("sandwich")) {
                sandwiches.append("\n").append(item.toString()).append("\n");
            }
        }
        return "\nJAKE'S BAR MENU\n" +
                "\nAPPETIZERS" + appetizers.toString() + "\n" +
                "BURGERS" + burgers.toString() + "\n" +
                "DESSERTS" + desserts.toString() + "\n" +
                "SANDWICHES" + sandwiches.toString() + "\n";
    }

    void addItem(MenuItem newItem) {
        String message = "That item has already been added to the menu.";
        if (menuItems.contains(newItem)) {
            System.out.println(message);
            return;
        }
        for (MenuItem item : menuItems) {
            if (item.equals(newItem)) {
                System.out.println(message);
                return;
            }
        }

        menuItems.add(newItem);
        lastUpdated = LocalDate.now();
    }

    void removeItem(MenuItem item) {
        menuItems.remove(item);
        lastUpdated = LocalDate.now();
    }



}
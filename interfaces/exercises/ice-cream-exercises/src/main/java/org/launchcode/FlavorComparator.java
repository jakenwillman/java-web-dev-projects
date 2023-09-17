package org.launchcode;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {
    @Override
    public int compare(Flavor flavor1, Flavor flavor2) {
        int numAllergens1 = flavor1.getAllergens().size();
        int numAllergens2 = flavor2.getAllergens().size();

        return Integer.compare(numAllergens2, numAllergens1);
    }
}

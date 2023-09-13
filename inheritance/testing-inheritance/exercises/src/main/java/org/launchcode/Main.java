package org.launchcode;

public class Main {
    public static void main(String[] args) {
        HouseCat gizmo = new HouseCat("Gizmo", 12);
        gizmo.eat();
        System.out.println(gizmo.isTired());

        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight());

        Cat plainCat = new HouseCat("plainCat", 8);
        HouseCat cheshireCat = new HouseCat("Chesire", 12);
        System.out.println(plainCat.noise());
        System.out.println(cheshireCat.noise());

        Cat suki = new HouseCat("Suki", 8);
        System.out.println(suki.noise());
        System.out.println(((HouseCat) suki).isSatisfied());
    }
}

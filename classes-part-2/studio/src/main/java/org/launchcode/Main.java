package org.launchcode;
public class Main {

    public static void main(String[] args) {
        MenuItem item1 = new MenuItem("Buffalo Wings", "Spicy breaded buffalo wings", 18.99, "appetizer");
        MenuItem item2 = new MenuItem("Bacon Cheese Burger", "Thick angus beef patty, topped with smoked bacon and pepper jack cheese", 14.99, "burger");
        MenuItem item3 = new MenuItem("Fried Chicken Sandwich", "Crispy fried chicken breast, tossed in buffalo sauce. Topped with ranch and pepper jack cheese", 12.99, "sandwich");
        MenuItem item4 = new MenuItem("White Chocolate Blackberry Cheesecake", "Rich white chocolate cheesecake topped with a warm blackberry compote", 12.49, "dessert");

        System.out.println(item1);

        Menu menu = new Menu();

        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);

        System.out.println(menu);

        menu.removeItem(item4);
        System.out.println(menu);

        System.out.println(item1.equals(item2));

        MenuItem item5 = new MenuItem("Buffalo Wings", "Spicy breaded buffalo wings", 18.99, "appetizer");

        System.out.println(item1.equals(item5));

        menu.addItem(item5);
        System.out.println(menu);
        menu.addItem(item1);
        System.out.println(menu);
    }
}
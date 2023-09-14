package technology;

public class Program {
    public static void main(String[] args) {
    Laptop laptop = new Laptop("Apple", "Macbook Pro", 2021, 14.2, 93);
    SmartPhone smartphone = new SmartPhone("Apple", "iPhone 15 Pro", 2023, "iOS 17");

    System.out.println("\nLAPTOP INFO");
    System.out.println("Brand: " + laptop.getBrand());
    System.out.println("Model: " + laptop.getModel());
    System.out.println("Year: " + laptop.getYear());
    System.out.println("Screen Size: " + laptop.getScreenSize());
    laptop.checkBatteryStatus();

    System.out.println("\n---------------------");
    System.out.println("\nSmart Phone Info: ");
    System.out.println("Brand: " + smartphone.getBrand());
    System.out.println("Model: " + smartphone.getModel());
    System.out.println("Year: " + smartphone.getYear());
    System.out.println("Operating System: " + smartphone.getOperatingSystem());
    smartphone.makeCall("111-222-3333");
    }
}


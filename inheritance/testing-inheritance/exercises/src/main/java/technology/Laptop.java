package technology;
class Laptop extends Computer {
    private double screenSize;
    private int batteryPercentage;

    public Laptop(String brand, String model, int year, double screenSize, int batteryPercentage) {
        super(brand,model,year);
        this.screenSize = screenSize;
        this.batteryPercentage = batteryPercentage;
    }

    public void checkBatteryStatus() {
        System.out.println("Battery life: " + batteryPercentage + "%");
    }
    public double getScreenSize() {
        return screenSize;
    }
    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
}

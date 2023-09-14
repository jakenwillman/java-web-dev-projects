package technology;
class SmartPhone extends Computer {
    private String operatingSystem;

    public SmartPhone(String brand, String model, int year, String operatingSystem) {
        super(brand, model, year);
        this.operatingSystem = operatingSystem;
    }
    public String getOperatingSystem() {
        return operatingSystem;
    }
    public void makeCall(String phoneNumber) {
        System.out.println("Calling: " + phoneNumber + "...");
    }
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}


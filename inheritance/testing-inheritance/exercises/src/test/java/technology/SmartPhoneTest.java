package technology;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SmartPhoneTest {

    @Test
    public void testSmartPhoneConstructor() {
        SmartPhone smartphone = new SmartPhone("Brand", "Model", 2022, "iOS17");
        assertEquals("Brand", smartphone.getBrand());
        assertEquals("Model", smartphone.getModel());
        assertEquals(2022, smartphone.getYear());
        assertEquals("iOS17", smartphone.getOperatingSystem());
    }

    @Test
    public void testSmartPhoneChangeOperatingSystem() {
        SmartPhone smartphone = new SmartPhone("Brand", "Model", 2022, "iOS17");
        smartphone.setOperatingSystem("Android");
        assertEquals("Android", smartphone.getOperatingSystem());
    }

    @Test
    public void testSmartPhoneBrandChange() {
        SmartPhone smartphone = new SmartPhone("Brand", "Model", 2022, "iOS17");
        smartphone.setBrand("Google");
        assertEquals("Google", smartphone.getBrand());
    }
}

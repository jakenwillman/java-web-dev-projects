package technology;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComputerTest {
    @Test
    public void testComputerConstructor() {
        Computer computer = new Computer("Brand", "Model", 2022);
        assertEquals("Brand", computer.getBrand());
        assertEquals("Model", computer.getModel());
        assertEquals(2022, computer.getYear());
    }

    @Test
    public void testComputerPowerOn() {
        Computer computer = new Computer("Brand", "Model", 2022);
        computer.powerOn();
    }

    @Test
    public void testComputerPowerOff() {
        Computer computer = new Computer("Brand", "Model", 2022);
        computer.powerOff();
    }
}

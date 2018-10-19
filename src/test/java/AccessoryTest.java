import accessories.Accessory;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoryTest {

    Accessory accessory;
    @Before
    public void before() {
        accessory = new Accessory("Drum sticks", 4, 8);
    }

    @Test
    public void hasDescription() {
        assertEquals("Drum sticks", accessory.getDescription());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(4, accessory.getBuyPrice(), 0);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(8, accessory.getSellPrice(), 0);
    }

    @Test
    public void canSetSellPrice() {
        accessory.setSellPrice(16);
        assertEquals(16, accessory.getSellPrice(), 0);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(1, accessory.calculateMarkup(), 0);
    }
}

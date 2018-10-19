import accessories.Accessory;
import instruments.InstrumentType;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Piano piano;
    Accessory accessory;
    @Before
    public void before() {
        shop = new Shop();
        piano = new Piano("Plastic", "Black", InstrumentType.KEYBOARD, 100, 150, "Small");
        accessory = new Accessory("Drum sticks", 4, 8);
    }

    @Test
    public void hasNoStock() {
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void hasStock() {
        shop.addStock(piano);
        assertEquals(1, shop.getStockCount());
    }

    @Test
    public void canRemoveStock() {
        shop.addStock(piano);
        shop.removeStock(piano);
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void canCalculateProfit() {
        shop.addStock(piano);
        shop.addStock(accessory);
        assertEquals(54, shop.calculateProfit(), 0);
    }
}

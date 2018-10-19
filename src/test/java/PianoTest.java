import instruments.InstrumentType;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;
    @Before
    public void before() {
        piano = new Piano("Plastic", "Black", InstrumentType.KEYBOARD, 100, 150, "Small");
    }

    @Test
    public void hasSize() {
        assertEquals("Small", piano.getSize());
    }

    @Test
    public void canPlay() {
        assertEquals("Plink plonk", piano.play());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Plastic", piano.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentType.KEYBOARD, piano.getType());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(100, piano.getBuyPrice(), 0);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(150, piano.getSellPrice(), 0);
    }

    @Test
    public void canSetSellPrice() {
        piano.setSellPrice(160);
        assertEquals(160, piano.getSellPrice(), 0);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(0.5, piano.calculateMarkup(), 0);
    }
}

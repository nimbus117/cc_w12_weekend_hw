import instruments.Guitar;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;
    @Before
    public void before() {
        guitar = new Guitar("Wood", "Red", InstrumentType.STRING, 50, 100, 12);
    }

    @Test
    public void hasStrings() {
        assertEquals(12, guitar.getNumberOfStrings());
    }

    @Test
    public void canPlay() {
        assertEquals("Strum strum", guitar.play());
    }
}

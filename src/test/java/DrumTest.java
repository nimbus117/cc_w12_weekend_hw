import instruments.Drum;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    Drum drum;
    @Before
    public void before() {
        drum = new Drum("Wood", "Blue", InstrumentType.PERCUSSION, 10, 20, "Snare");
    }

    @Test
    public void hasDrumType() {
        assertEquals("Snare", drum.getDrumType());
    }

    @Test
    public void canPlay() {
        assertEquals("Bang bang", drum.play());
    }
}

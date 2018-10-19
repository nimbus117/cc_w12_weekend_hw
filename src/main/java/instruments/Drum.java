package instruments;

public class Drum extends Instrument{

    private String drumType;

    public Drum(String material, String colour, InstrumentType type, double buyPrice, double sellPrice, String drumType) {
        super(material, colour, type, buyPrice, sellPrice);
        this.drumType = drumType;
    }

    public String getDrumType() {
        return drumType;
    }

    @Override
    public String play() {
        return "Bang bang";
    }
}

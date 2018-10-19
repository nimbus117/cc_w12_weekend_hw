package instruments;

public class Piano extends Instrument {

    private String size;

    public Piano(String material, String colour, InstrumentType type, double buyPrice, double sellPrice, String size) {
        super(material, colour, type, buyPrice, sellPrice);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String play() {
        return "Plink plonk";
    }
}

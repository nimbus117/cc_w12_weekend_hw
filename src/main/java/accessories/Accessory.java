package accessories;

import interfaces.ISell;

public class Accessory implements ISell {
    private String description;
    private double buyPrice;
    private double sellPrice;

    public Accessory(String description, double buyPrice, double sellPrice) {
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getDescription() {
        return description;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    @Override
    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    @Override
    public double calculateMarkup() {
        return ((getSellPrice() / getBuyPrice()) - 1);
    }
}

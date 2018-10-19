package shop;

import interfaces.ISell;

import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public int getStockCount() {
        return stock.size();
    }

    public void addStock(ISell item) {
        stock.add(item);
    }

    public void removeStock(ISell item) {
        stock.remove(item);
    }

    public double calculateProfit() {
        int totalProfit = 0;

        for (ISell item:stock) {
            double profit = item.getBuyPrice() * item.calculateMarkup();
            totalProfit += profit;
        }
        return  totalProfit;
    }
}

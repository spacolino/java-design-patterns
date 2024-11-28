package com.patterns.observer.stock;

import java.util.HashMap;
import java.util.Map;

public class StockDisplay implements StockObserver {
    private final Map<String, Double> stocks = new HashMap<>();
    private final String displayName;

    public StockDisplay(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public void update(String symbol, double price) {
        stocks.put(symbol, price);
        display();
    }

    private void display() {
        System.out.println("\nStock Display: " + displayName);
        stocks.forEach((symbol, price) ->
            System.out.printf("%s: $%.2f%n", symbol, price));
    }
}

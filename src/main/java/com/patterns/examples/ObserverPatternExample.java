package com.patterns.examples;

import com.patterns.observer.stock.StockDisplay;
import com.patterns.observer.stock.StockMarket;

public class ObserverPatternExample {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        StockDisplay display1 = new StockDisplay("NYSE Display");
        StockDisplay display2 = new StockDisplay("NASDAQ Display");

        stockMarket.addObserver(display1);
        stockMarket.addObserver(display2);

        stockMarket.updateStock("AAPL", 150.0);
        stockMarket.updateStock("GOOGL", 2800.0);
        stockMarket.updateStock("MSFT", 300.0);
    }
}

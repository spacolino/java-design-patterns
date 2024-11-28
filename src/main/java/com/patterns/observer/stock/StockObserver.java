package com.patterns.observer.stock;

public interface StockObserver {
    void update(String symbol, double price);
}

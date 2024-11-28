package com.patterns.observer.stock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class StockMarket {
    private final Map<String, Double> stocks = new HashMap<>();
    private final List<StockObserver> observers = new ArrayList<>();
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void addObserver(StockObserver observer) {
        lock.writeLock().lock();
        try {
            observers.add(observer);
        } finally {
            lock.writeLock().unlock();
        }
    }

    public void removeObserver(StockObserver observer) {
        lock.writeLock().lock();
        try {
            observers.remove(observer);
        } finally {
            lock.writeLock().unlock();
        }
    }

    public void updateStock(String symbol, double price) {
        lock.writeLock().lock();
        try {
            stocks.put(symbol, price);
            notifyObservers(symbol, price);
        } finally {
            lock.writeLock().unlock();
        }
    }

    private void notifyObservers(String symbol, double price) {
        lock.readLock().lock();
        try {
            for (StockObserver observer : observers) {
                try {
                    observer.update(symbol, price);
                } catch (Exception e) {
                    System.err.println("Failed to notify observer: " + e.getMessage());
                }
            }
        } finally {
            lock.readLock().unlock();
        }
    }
}


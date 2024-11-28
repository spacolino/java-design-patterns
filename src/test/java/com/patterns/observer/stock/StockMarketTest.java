package com.patterns.observer.stock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StockMarketTest {
    private StockMarket stockMarket;
    private TestStockDisplay display1;
    private TestStockDisplay display2;

    @BeforeEach
    void setUp() {
        stockMarket = new StockMarket();
        display1 = new TestStockDisplay("Display 1");
        display2 = new TestStockDisplay("Display 2");
    }

    @Test
    void shouldNotifyAllObserversWhenStockUpdated() {
        // Given
        stockMarket.addObserver(display1);
        stockMarket.addObserver(display2);

        // When
        stockMarket.updateStock("AAPL", 150.0);

        // Then
        assertEquals(150.0, display1.getPrice("AAPL"));
        assertEquals(150.0, display2.getPrice("AAPL"));
    }

    private static class TestStockDisplay implements StockObserver {
        private final Map<String, Double> stocks = new HashMap<>();
        private final String name;

        public TestStockDisplay(String name) {
            this.name = name;
        }

        @Override
        public void update(String symbol, double price) {
            stocks.put(symbol, price);
        }

        public double getPrice(String symbol) {
            return stocks.getOrDefault(symbol, 0.0);
        }
    }
}

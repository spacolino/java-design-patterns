package com.patterns.examples;

import com.patterns.strategy.payment.CreditCardPayment;
import com.patterns.strategy.payment.PayPalPayment;
import com.patterns.strategy.payment.PaymentProcessor;

public class StrategyPatternExample {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        // Process credit card payment
        processor.setPaymentStrategy(
            new CreditCardPayment("1234-5678-9012-3456", "123", "12/25"));
        processor.processPayment(100.0);

        // Process PayPal payment
        processor.setPaymentStrategy(
            new PayPalPayment("user@example.com", "password"));
        processor.processPayment(50.0);
    }
}

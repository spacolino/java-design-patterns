package com.patterns.strategy.payment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PaymentProcessorTest {

    @Test
    void shouldProcessCreditCardPayment() {
        PaymentProcessor processor = new PaymentProcessor();
        PaymentStrategy creditCard = new CreditCardPayment("1234-5678", "123", "12/24");
        processor.setPaymentStrategy(creditCard);

        assertDoesNotThrow(() -> processor.processPayment(100.0));
    }

    @Test
    void shouldProcessPayPalPayment() {
        PaymentProcessor processor = new PaymentProcessor();
        PaymentStrategy payPal = new PayPalPayment("test@email.com", "password");
        processor.setPaymentStrategy(payPal);

        assertDoesNotThrow(() -> processor.processPayment(100.0));
    }

    @Test
    void shouldThrowExceptionWhenStrategyNotSet() {
        PaymentProcessor processor = new PaymentProcessor();

        assertThrows(IllegalStateException.class, () -> processor.processPayment(100.0));
    }
}

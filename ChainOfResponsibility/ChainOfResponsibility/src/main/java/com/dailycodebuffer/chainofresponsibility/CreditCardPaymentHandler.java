package com.dailycodebuffer.chainofresponsibility;

public class CreditCardPaymentHandler extends PaymentHandler{
    public void handlePayment(double amount) {
        if (amount <= 1000) {
            System.out.println("Paid using credit card: $" + amount);
        } else {
            next.handlePayment(amount);
        }
    }
}

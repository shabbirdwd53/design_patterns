package com.solid.liskov.bad;

public class HomeLoan implements LoanPayment{
    @Override
    public void doPayment(int amount) {

    }

    @Override
    public void foreCloseLoan() {

    }

    @Override
    public void doRepayment(int amount) {

    }
}

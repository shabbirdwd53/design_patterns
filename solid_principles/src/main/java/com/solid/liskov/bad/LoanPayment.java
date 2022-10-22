package com.solid.liskov.bad;

/**
 * This is loan interface responsible for payment related operations on loan account
 * LoanPayment implemented by actual loans like Home Loan, Credit Card Loan etc.
 * For credit card/personal loan which is unsecured foreclosure and repayment is not allowed.
 * https://www.baeldung.com/java-liskov-substitution-principle#:~:text=The%20Liskov%20Substitution%20Principle,-4.1.&text=Barbara%20Liskov%2C%20defining%20it%20in,is%20a%20subtype%20of%20T.
 */
public interface LoanPayment {
    public void doPayment(int amount);
    public void foreCloseLoan();
    public void doRepayment(int amount);
}

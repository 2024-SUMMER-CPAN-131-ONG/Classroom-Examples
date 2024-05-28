package org.humber.week4;

public enum PaymentType {
    CREDIT_CARD("Credit Card"),
    DEBIT_CARD("Debit Card"),
    CASH("Cash"),
    BANK_TRANSFER("Bank Transfer");

    private String description;

    private PaymentType(String description) {
        this.description = description;
    }

    public static PaymentType fromValue(String value) {
        for(PaymentType paymentType : PaymentType.values()) {
            if(paymentType.description.equals(value)) {
                return paymentType;
            }
        }
        throw new IllegalArgumentException("Invalid value: " + value);
    }


}

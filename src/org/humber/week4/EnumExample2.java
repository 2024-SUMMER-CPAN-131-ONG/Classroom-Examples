package org.humber.week4;


public class EnumExample2 {


    public static void main(String[] args) {
        for(PaymentType paymentType : PaymentType.values()) {
            System.out.println("Payment type is: " + paymentType);
        }

        System.out.println("Payment type is: " + PaymentType.fromValue("Credit CARD"));

        switch (PaymentType.fromValue("Credit CARD")) {
            case CASH:
                System.out.println("Payment type is: " + PaymentType.CASH);
                break;
            case CREDIT_CARD:
                System.out.println("Payment type is: " + PaymentType.CREDIT_CARD);
                break;
            case DEBIT_CARD:
                System.out.println("Payment type is: " + PaymentType.DEBIT_CARD);
                break;
            default:
                System.out.println("Payment type is Unkown");
        }

    }

}

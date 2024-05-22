package org.humber.week1;

public class DataTypes {

    public static void main(String[] args) {
        // Primitive Data Types
        byte byteValue = 127;
        Byte byteObject = 127;

        short shortValue = 32767;
        Short shortObject = 32767;
        int intValue = 2147483647; //-2147483648 to 2147483647
        Integer intObject = 2147483647;

        long longValue = 9223372036854775807L;
        Long longObject = 9223372036854775807L;


        float floatValue = 3.4028235E38f;
        Float floatObject = 3.4028235E38f;

        double doubleValue = 1.7976931348623157E308; //0
        Double doubleObject = 1.7976931348623157E308; // null

        char charValue = 'A';
        Character charObject = 'A';

        boolean booleanValue = true;
        Boolean booleanObject = true;

        System.out.println("byteValue: " + byteValue);
        System.out.println("shortValue: " + shortValue);
        System.out.println("intValue: " + intValue);
        System.out.println("longValue: " + longValue);
        System.out.println("floatValue: " + floatValue);
        System.out.println("doubleValue: " + doubleValue);
        System.out.println("charValue: " + charValue);
        System.out.println("booleanValue: " + booleanValue);
    }
}

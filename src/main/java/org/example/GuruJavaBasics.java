package org.example;
import java.util.Arrays;

public class GuruJavaBasics {
    public static void primitiveDataTypes() {
        //byte type example (from -128 to 127)
        byte byteExample = -125;
        System.out.println("This is an example of Byte data type in Java: " + byteExample);

        //short type example (from -32,768 to 32,767)
        short shortExample = 19000;
        System.out.println("This is an example of Short data type in Java: " + shortExample);

        //int type example (-2,147,483,648 to 2,147,483,647)
        int intExample = 2000000;
        System.out.println("This is an example of Int data type in Java: " + intExample);

        //long type example (from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
        long longExample = 52233222223L;
        System.out.println("This is an example of Long data type in Java: " + longExample);

        //float type example (up to 7 decimal digits)
        float floatExample = -3.2F;
        System.out.println("This is an example of Float data type in Java: " + floatExample);

        //double type example (up to 15 decimal digits)
        double doubleExample = 8.5;
        System.out.println("This is an example of Double data type in Java: " + doubleExample);
    }

    public static void arrays() {
        int[] arrayExample = new int[]{11, 22, 33, 44, 55};
        System.out.println("This is an example of array in Java: " + Arrays.toString(arrayExample));
    }

    public static void booleanAndComparison() {
        boolean booleanAndExample = (2 < 3) && (3 > 4);
        System.out.println("This is an example of boolean \"and\" in Java (True and False): " + booleanAndExample);

        boolean booleanAndNotExample = (2 != 3);
        System.out.println("This is an example of boolean \"not\" in Java (True)" + booleanAndNotExample);

        boolean booleanOrExample = (2 <= 3) || (3 >= 4);
        System.out.println("This is an example of boolean \"or\" in Java (True and False): " + booleanOrExample);


    }

    public static void primitiveDataTypesActions() {
        int additionExample = 5 + 7;
        System.out.println("This is an example of addition in Java: 5 plus 7 equals " + additionExample);

        int subtractExample = 5 - 3;
        System.out.println("This is an example of subtraction in Java: 5 minus 3 equals " + subtractExample);

        int multiplicationExample = 5 * 8;
        System.out.println("This is an example of multiplication in Java: 5 times 8 equals " + multiplicationExample);

        int intDivisionExample = 25 / 5;
        System.out.println("This is an example of integer division in Java: 25 divided by 5 equals " + intDivisionExample);

        float floatDivisionExample = 15.0f / 2;
        System.out.println("This is an example of float division in Java: 15 divided by 2 equals " + floatDivisionExample);

        int modDivisionExample = 15 % 4;
        System.out.println("This is an example of modulus division in Java: 15 divided by 4 equals " + modDivisionExample);

    }

    public static void intMaxOverFlowExample() {
        int firstBigIntNumber = 7777777777000000000;
        int secondBigIntNumber = 100077777000000;
        int overflowMaxResult = firstBigIntNumber + secondBigIntNumber;
        System.out.println("Integer overflow occurs when you try to express a number that is larger than the largest" +
                " number the integer type can handle. " + overflowMaxResult);
    }

    public static void intMinOverFlowExample() {
        //integer minimum overflow example
        int varC = 2000000000;
        int varD = -1000000000;
        int overflowMinResult = varD - varC;
        System.out.println("This is an example of overflow minimum value of type in Java: int -1000000000 minus int " +
                "2000000000 equals " + overflowMinResult);
    }

    public static void mixedTypesInteractionLongWithInt() {
        System.out.println("Long plus int will end up as long, for example " + (299 + 9000000000000000000L));
    }


    public static void main(String[] args) {
        primitiveDataTypes();
        arrays();
        booleanAndComparison();
        primitiveDataTypesActions();
        intMaxOverFlowExample();
        intMinOverFlowExample();
        mixedTypesInteractionLongWithInt();
    }
}
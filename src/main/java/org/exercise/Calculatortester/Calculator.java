package org.exercise.Calculatortester;

public class Calculator {


    private static float checkNumber(float number) {
        float validNumber;
        if (Float.isNaN(number)) {
            throw new IllegalArgumentException("Il numero non è valido!");
        } else {
            try {
                validNumber = Float.parseFloat(String.valueOf(number));

            } catch (NumberFormatException e) {
                System.out.println("Devi inserire un numero!");
            }
        }
        return number;
    }

    //    METODI PER LE OPERAZIONI
    public static float addNumber(float num1, float num2) {
        checkNumber(num1);
        checkNumber(num2);
        return num1 + num2;
    }

    public static float substract(float num1, float num2) {
        checkNumber(num1);
        checkNumber(num2);
        return num1 - num2;
    }

    public static float divide(float num1, float num2) {
        checkNumber(num1);
        checkNumber(num2);
        if (num2 == 0.0) {
            throw new IllegalArgumentException("Impossibile dividere per zero!");
        }
        return num1 / num2;
    }

    public static float multiply(float num1, float num2) {
        checkNumber(num1);
        checkNumber(num2);
        return num1 * num2;
    }
}

package com.k7;

public class Tasks {
    public void sumOfElementsNumber(int number) {
        String num = String.valueOf(number);
        int elementSum = 0;
        for (int i = 0; i < num.length(); i++) {
            elementSum = elementSum + number % 10;
            number = number / 10;
        }
        System.out.println("sum of each element of number: " + elementSum);
    }

    public void fromCelsiusToFahrenheit(double tempC) {
        double tempF = tempC * 1.8 + 32;
        System.out.println("Temperature by Fahrenheit: " + tempF + "°F");
    }
}

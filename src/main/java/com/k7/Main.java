package com.k7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tasks tasks = new Tasks();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some number");
        int number = sc.nextInt();
        tasks.sumOfElementsNumber(number);

        System.out.println("Enter the temperature by Celsius");
        double temperature = sc.nextDouble();
        tasks.fromCelsiusToFahrenheit(temperature);
    }
}

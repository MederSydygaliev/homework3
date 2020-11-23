package com.company;

public class Main {

    public static void main(String[] args) {
        double[] numbers = {10.8, 60.2, 4.7, -51.2, -3.8, -4.5, 6.66, 78.78, 15.01, -4.47, -12.1, 88.4, 0.55, 21.7, 0.5};
        double sum = 0;
        for (double x : numbers) {
            sum += x;
        }
        System.out.print("Среднее арифметическое число: " + sum / numbers.length);

    }
}

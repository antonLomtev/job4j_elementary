package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumSubtractionAndDivision(double first, double second) {
        return subtraction(first, second) + division(first, second);
    }

    public static double sumSumAndMultiplyAndSubtractAndDivision(double first, double second) {
        return sum(first, second) + sumAndMultiply(first, second)
                + subtraction(first, second) + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Резульат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Резульат расчета равен: " + sumSubtractionAndDivision(10, 20));
        System.out.println("Резульат расчета равен: " + sumSumAndMultiplyAndSubtractAndDivision(10, 20));
    }
}

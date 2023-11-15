package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double x2MinusX1 = x2 - x1;
        double y2MinusY1 = y2 - y1;
        double powX = Math.pow(x2MinusX1, 2);
        double powY = Math.pow(y2MinusY1, 2);
        double rsl = Math.sqrt((powX + powY));
        return rsl;
    }

    public static void print(int x1, int y1, int x2, int y2, double result) {
        System.out.println("result (" + x1 + ", " + y1 + ")" + " to (" + x2 + ", " + y2 + " ) " + result);
    }

    public static void main(String[] args) {
        double result1 = distance(0, 0, 2, 0);
        double result2 = distance(10, 11, 4, 10);
        double result3 = distance(5, 7, 9, 4);
        print(0, 0, 2, 0, result1);
        print(10, 11, 4, 10, result2);
        print(5, 7, 9, 4, result3);
    }
}

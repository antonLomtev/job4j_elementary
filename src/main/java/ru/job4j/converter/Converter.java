package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float outEuro = rubleToEuro(in);
        boolean passedEuro = expected == outEuro;

        float expectedRublesToDollar = 2.3333333F;
        float outDollar = rubleToDollar(in);
        boolean passedDollar = expectedRublesToDollar == outDollar;
        System.out.println("140 rubles are 2 euro. Test result : " + passedEuro);
        System.out.println("140 rubles are 2.3333333 dollar. Test result :  " + passedDollar);
    }
}

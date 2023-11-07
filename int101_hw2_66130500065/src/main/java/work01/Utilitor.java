package work01;

public class Utilitor {
    public static String testString(String value) {
        if (value == null) throw new NullPointerException();
        else if (value.isBlank()) throw new IllegalArgumentException();
        return value;
    }

    public static double testPositive(double value) {
        if (value < 0) throw new IllegalArgumentException();
        return value;
    }

    public static long computeIsbn10(long isbn10) {
        long result = 0;
        for (int i = 2; i <= 10; i++) {
            long index = isbn10 % 10;
            isbn10 = isbn10 / 10;
            result += index * i;
        }
        return 11 - (result % 11);
    }
}

package example.com.utils;

public class Generator {
    public static int getRandomInt(int maxValue) {
        return (int) (Math.random() * (maxValue + 1));
    }
}

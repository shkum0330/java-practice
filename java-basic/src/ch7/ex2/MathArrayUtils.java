package ch7.ex2;

public class MathArrayUtils {

    private MathArrayUtils(){

    }

    public static int sum(int[] values) {
        int sum=0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        int minValue=values[0];
        for (int i = 1; i < values.length; i++) {
            minValue=Math.min(minValue,values[i]);
        }
        return minValue;
    }

    public static int max(int[] values) {
        int maxValue=values[0];
        for (int i = 1; i < values.length; i++) {
            maxValue=Math.max(maxValue,values[i]);
        }
        return maxValue;
    }
}

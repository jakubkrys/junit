package pl.jakubkrys.junit.math;

public class ArrayCalculation {

    public static int min(int[] tab) {
        int min = tab[0];
        for (int value : tab) {
            if (value < min){
                min = value;
            }
        }
        return min;
    }

    public static int max(int[] tab) {
        int max = tab[0];
        for (int value : tab) {
            if (value > max){
                max = value;
            }
        }
        return max;
    }

    public static double avg(int[] tab) {
        int sum = 0;
        for (int value : tab) {
            sum = sum + value;
        }
        double avg = sum/ tab.length;
        return avg;
    }
}

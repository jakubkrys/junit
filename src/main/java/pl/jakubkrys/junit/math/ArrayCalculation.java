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
}

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

    public static double med(int[] tab) {
        ArrayCalculation.sort(tab);
        double med;
        if(tab.length%2 == 0){
            double first = tab[(tab.length/2)-1];
            double second = tab[tab.length/2];
            med = (first+second)/2;
        } else {
            med = tab[(tab.length-1)/2];
        }
        return med;
    }

    private static void sort(int[] tab) {
        int o = 0;
        int tmp;
        while(o <= tab.length) {
            for (int i = 0; i < (tab.length - 1); i++) {
                if (tab[i] > tab[i + 1]) {
                    tmp = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = tmp;
                }
            }
            o++;
        }
    }
}

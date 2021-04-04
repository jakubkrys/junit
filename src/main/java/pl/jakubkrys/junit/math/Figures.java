package pl.jakubkrys.junit.math;

public class Figures {
    public static double circleCircuit(double a) {
        final double PI = 3.14;
        return 2*a*PI;
    }

    public static double circleArea(double a) {
        final double PI = 3.14;
        return Math.pow(a,2)*PI;
    }

    public static double squareCircuit(double a) {
        return 4 * a;
    }

    public static double squareArea(double a) {
        return Math.pow(a,2);
    }

    public static double triangleCircuit(double a, double b, double c) {
        double[] sides = {a,b,c};
        for (int i = 0; i < sides.length-1; i++) {
            for (int j = 0; j < sides.length-1; j++) {
                if (sides[j] < sides[j+1]){
                    double tmp = sides[j];
                    sides[j] = sides[j+1];
                    sides[j+1] = tmp;

                }
            }
        }

        if (sides[0] >= Double.sum(sides[1], sides[2])){
            return 0;
        } else {
            return Double.sum((Double.sum(sides[0], sides[1])), sides[2]);
        }
    }

    public static double triangleArea(double a, double h) {
        return (a/2) * h;
    }

    public static double trapezeCircuit(double a, double b, double c) {
        if (a > b + (2 * c)){
            return 0;
        } else {
            return a + b + (2 * c);
        }
    }

    public static double trapezeArea(double a, double b, double h) {
        return ((a + b)/2) * h;
    }
}

package pl.jakubkrys.junit.examples;

import java.util.Random;

public class Examples {

    public static boolean isAdult(int age) {
        return age >= 18;
    }

    public static int sum(int a, int b) {
        return a+b;
    }

    public static int randFrom5To100(){
        Random random = new Random();
        return random.nextInt(5)+5;
    }
}

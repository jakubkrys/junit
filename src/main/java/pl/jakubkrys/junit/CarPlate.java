package pl.jakubkrys.junit;

import java.util.Random;

public class CarPlate {

    public static String randomPlate() {
        String plate = "";
        Random random = new Random();
        int s;
        for (int i = 0; i < 7; i++) {
            if (i < 2) {
                s = random.nextInt(25)+65;
                plate += (char) s;
            } else {
                s = random.nextInt(9)+48;
                plate += (char) s;
            }
        }
        return plate;
    }

    public static void main(String[] args) {
        System.out.println(randomPlate());
    }
}

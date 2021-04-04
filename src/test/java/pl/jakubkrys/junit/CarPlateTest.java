package pl.jakubkrys.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarPlateTest {

    @Test
    public void isPlateCorrect() {
        //g
        String plate = CarPlate.randomPlate();
        //w

        //t
        System.out.println(plate.substring(0,2));
        System.out.println(plate.substring(2));
        System.out.println(plate.substring(0,2).matches("A-Z"));
        System.out.println(plate.substring(2).matches("0-9"));
        assertTrue((plate.substring(0,2).toUpperCase().matches("A-Z")) && (plate.substring(2).matches("0-9")));
    }
}

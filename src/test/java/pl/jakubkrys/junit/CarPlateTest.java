package pl.jakubkrys.junit;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarPlateTest {

    @RepeatedTest(10)
    public void areLettersCorrect() {
        String plate = CarPlate.randomPlate();
        assertTrue(((plate.substring(0,2)).matches("[A-Z]*")));
    }

    @RepeatedTest(10)
    public void areDigitsCorrect() {
        //g
        String plate = CarPlate.randomPlate();
        assertTrue(plate.substring(2).matches("[0-9]*"));
    }

    @RepeatedTest(10)
    public void isPlateCorrect() {
        String plate = CarPlate.randomPlate();
        assertTrue(((plate.substring(0,2)).matches("[A-Z]*")) && (plate.substring(2).matches("[0-9]*")));
    }
}

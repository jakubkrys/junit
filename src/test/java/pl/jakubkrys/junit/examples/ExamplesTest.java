package pl.jakubkrys.junit.examples;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class ExamplesTest {

    @ParameterizedTest
    @ValueSource (ints = {11, 2, 15, 5})
    public void isNotAdult(int age){
        //when
boolean isAdult = Examples.isAdult(age);
        //then
        assertTrue(isAdult);
    }
}

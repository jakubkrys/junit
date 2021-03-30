package pl.jakubkrys.junit.examples;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class ExamplesTest {

    @ParameterizedTest(name = "Person with age {0} is not adult")
    @ValueSource(ints = {11, 2, 15, 5, 10, 14, 17})
    public void isNotAdult(int age) {
        //when
        boolean isAdult = Examples.isAdult(age);
        //then
        assertFalse(isAdult);
    }

    @ParameterizedTest(name = "Person with age {0} is adult")
    @ValueSource(ints = {18, 35, 22, 89, 109})
    public void isAdult(int age) {
        //when
        boolean isAdult = Examples.isAdult(age);
        //then
        assertTrue(isAdult);
    }
}

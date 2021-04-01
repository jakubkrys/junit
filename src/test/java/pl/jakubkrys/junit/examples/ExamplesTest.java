package pl.jakubkrys.junit.examples;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;

public class ExamplesTest {

    @ParameterizedTest(name = "Person with age {0} is not adult")
    @ValueSource(ints = {11, 2, 15, 5, 10, 14, 17})
    public void isNotAdult(int age) {
        assertFalse(Examples.isAdult(age));
    }

    @ParameterizedTest(name = "Person with age {0} is adult")
    @ValueSource(ints = {18, 35, 22, 89, 109})
    public void isAdult(int age) {
        assertTrue(Examples.isAdult(age));
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({"0, 1, 1","1, 2, 3","3, 5, 8"})
    public void firstPlusSecondEqualsThird(int a, int b, int expectedResult){
        assertEquals(expectedResult, Examples.sum(a,b));
    }

    @RepeatedTest(100)
    public void isFrom5To100(){
        int number = Examples.randFrom5To100();
        assertTrue(number >= 5 && number <= 100);
    }
}

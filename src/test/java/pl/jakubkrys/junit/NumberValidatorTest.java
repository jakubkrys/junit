package pl.jakubkrys.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberValidatorTest {

    @Test
    public void isValidIfLengthIs3() {
        //given
        int number = 451;

        //when
        boolean isValid = NumberValidator.numberLengthValidation(number);

        //then
        assertTrue(isValid);

    }

    @Test
    public void isNotValidIfLengthIs2(){
        //given
        int number = 45;
        //when
        boolean isValid = NumberValidator.numberLengthValidation(number);
        //then
        assertFalse(isValid);
    }

    @Test
    public void isNotValidIfLengthIs4(){
        //given
        int number = 4512;
        //when
        boolean isValid = NumberValidator.numberLengthValidation(number);
        //then
        assertFalse(isValid);
    }
}

package pl.jakubkrys.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidatorTest {

    @Test
    public void isNotValidIfLength4(){
        //given
        String pesel = "1511";

        //when
        boolean isValid = Validator.peselValidation(pesel);

        //then
        assertFalse(isValid);
    }

    @Test
    public void isNotValidIfLength11(){
        //given
        String pesel = "15119952648";

        //when
        boolean isValid = Validator.peselValidation(pesel);

        //then
        assertTrue(isValid);
    }
}

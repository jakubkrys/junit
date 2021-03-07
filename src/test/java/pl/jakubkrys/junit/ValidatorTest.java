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
    public void isValidIfLength11(){
        //given
        String pesel = "15119952648";

        //when
        boolean isValid = Validator.peselValidation(pesel);

        //then
        assertTrue(isValid);
    }

    @Test
    public void isNotValidDayIfEquals99(){
        //given
        String pesel = "15119952648";

        //when
        boolean isValid = Validator.peselValidation(pesel);

        //then
        assertFalse(isValid);

    }

    @Test
    public void isValidDayIfFrom1To31(){
        //given
        String pesel = "15110152648";

        //when
        boolean isValid = Validator.peselValidation(pesel);

        //then
        assertTrue(isValid);

    }
}
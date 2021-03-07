package pl.jakubkrys.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PeselValidatorTest {

    @Test
    public void isNotValidLengthIf4(){
        //given
        String pesel = "1511";

        //when
        boolean isValid = PeselValidator.peselLengthValidation(pesel);

        //then
        assertFalse(isValid);
    }

    @Test
    public void isValidLengthIf11(){
        //given
        String pesel = "15113152648";

        //when
        boolean isValid = PeselValidator.peselLengthValidation(pesel);

        //then
        assertTrue(isValid);
    }

    @Test
    public void isNotValidDayIfEquals32(){
        //given
        String pesel = "15113252648";

        //when
        boolean isValid = PeselValidator.peselDayValidation(pesel);

        //then
        assertFalse(isValid);

    }

    @Test
    public void isValidDayIfFrom1To31(){
        //given
        String pesel = "15113152648";

        //when
        boolean isValid = PeselValidator.peselDayValidation(pesel);

        //then
        assertTrue(isValid);

    }
}
package pl.jakubkrys.junit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @ParameterizedTest
    @CsvSource({"Jurek,88092734012,1988","Kasia,63122400987,1963"})
    public void isCorrectYear(String name, String pesel, String year){
        //given
        Person person = new Person(name, pesel);
        //when
        String yearResult = person.getYearFromPesel;
        //then
        assertEquals(year,yearResult);

    }
}

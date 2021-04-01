package pl.jakubkrys.junit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @ParameterizedTest(name = "{0} was born in {2}")
    @CsvSource({"Jurek,88092734012,1988","Kasia,63122400987,1963","Gracjan,39090142372,1939"})
    public void isCorrectYear(String name, String pesel, String year){
        //given
        Person person = new Person(name, pesel);
        //when
        String yearResult = person.getYearFromPesel();
        //then
        assertEquals(year,yearResult);

    }

    @ParameterizedTest(name = "{0} was not born in {2}")
    @CsvSource({"Bożena,88092734012,1945","Józef,63122400987,1964","Elżbieta,45090142372,1939"})
    public void isIncorrectYear(String name, String pesel, String year){
        //given
        Person person = new Person(name, pesel);
        //when
        String yearResult = person.getYearFromPesel();
        //then
        assertNotEquals(year,yearResult);

    }
}

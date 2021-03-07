package pl.jakubkrys.junit.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayCalculationTest {

    @Test
    public void minValueIs1(){
        //given
        int[] tab = {4,6,1,2,66};
        //when
        int min = ArrayCalculation.min(tab);
        //then
        assertEquals(1, min);
    }

    @Test
    public void minValueIsMinus5(){
        //given
        int[] tab = {4,16,-5,2,26};
        //when
        int min = ArrayCalculation.min(tab);
        //then
        assertEquals(-5, min);
    }

    @Test
    public void minValueIs1000(){
        //given
        int[] tab = {1283,1283,21275,92199,1000};
        //when
        int min = ArrayCalculation.min(tab);
        //then
        assertEquals(1000, min);
    }

    @Test
    public void minValueIsNot1000(){
        //given
        int[] tab = {1283,1283,-21275,92199,1000};
        //when
        int min = ArrayCalculation.min(tab);
        //then
        assertNotEquals(1000, min);
    }
}

package pl.jakubkrys.junit.math;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;


public class FiguresTest {

    // CIRCLE

    // circuit
    @ParameterizedTest (name = "Circle with radius {0} has a circumference {1}")
    @CsvSource({"2.0,12.56","4.5,28.26","23.45,147.266","99,621.72","3.14,19.7192"})
    public void isCorrectCircleCircuit(double a, double expectedResult){
        assertEquals(expectedResult,Figures.circleCircuit(a));
    }

    @ParameterizedTest (name = "Circle with radius {0} has not a circumference {1}")
    @CsvSource({"2.0,16.96","4.2,28.26","23.45,147","9.439,621.72","999,19.7192"})
    public void isNotCorrectCircleCircuit(double a, double expectedResult){
        assertNotEquals(expectedResult,Figures.circleCircuit(a));
    }

    // area
    @ParameterizedTest (name = "Circle with radius {0} has an area {1}")
    @CsvSource({"2.0,12.56","4.5,63.585","23.5,1734.065","99,30775.14","3,28.26"})
    public void isCorrectCircleArea (double a, double expectedResult){
        assertEquals(expectedResult,Figures.circleArea(a));
    }

    @ParameterizedTest (name = "Circle with radius {0} has not an area {1}")
    @CsvSource({"2.0,1000","4.0,63.585","50,1726.69385","99,307.7514","3.14,28.26"})
    public void isNotCorrectCircleArea(double a, double expectedResult){
        assertNotEquals(expectedResult,Figures.circleArea(a));
    }

    // SQUARE

    // circuit
    @ParameterizedTest (name = "Square with side {0} has a circumference {1}")
    @CsvSource({"2,8","4.5,18","23.45,93.8","99,396","3.14,12.56"})
    public void isCorrectSquareCircuit(double a, double expectedResult){
        assertEquals(expectedResult,Figures.squareCircuit(a));
    }

    @ParameterizedTest (name = "Square with side {0} has not a circumference {1}")
    @CsvSource({"2.0,16.96","4.2,28.26","23.45,147","9.439,621.72","999,19.7192"})
    public void isNotCorrectSquareCircuit(double a, double expectedResult){
        assertNotEquals(expectedResult,Figures.squareCircuit(a));
    }

    // area
    @ParameterizedTest (name = "Square with side {0} has an area {1}")
    @CsvSource({"2,4","4.5,20.25","23.5,552.25","99,9801","3.14,9.8596"})
    public void isCorrectSquareArea (double a, double expectedResult){
        assertEquals(expectedResult,Figures.squareArea(a));
    }

    @ParameterizedTest (name = "Square with side {0} has not an area {1}")
    @CsvSource({"2.0,1000","4.0,63.585","50,1726.69385","99,307.7514","3.14,28.26"})
    public void isNotCorrectSquareArea(double a, double expectedResult){
        assertNotEquals(expectedResult,Figures.squareArea(a));
    }

    // TRIANGLE

    // circuit
    @ParameterizedTest (name = "Triangle with sides {0}, {1} and {2} has a circumference {3}")
    @CsvSource({"2,3,4,9","4.5,5.5,6.5,16.5","23.45,22.12,36.01,81.58","99,98,2,199","3.14,3.16,3.18,9.48"})
    public void isCorrectTriangleCircuit(double a, double b, double c, double expectedResult){
        assertEquals(expectedResult,Figures.triangleCircuit(a,b,c));
    }

    @ParameterizedTest (name = "Triangle with sides {0}, {1} and {2} has not a circumference {3}")
    @CsvSource({"2,3,4,24","8.5,7.5,6.5,16.5","23.45,22.12,36.01,144.45","99,98,2,200","1,2,3,6"})
    public void isNotCorrectTriangleCircuit(double a, double b, double c, double expectedResult){
        assertNotEquals(expectedResult,Figures.triangleCircuit(a,b,c));
    }

    // area
    @ParameterizedTest (name = "Triangle with side {0} and height {1} has an area {2}")
    @CsvSource({"40,15,300","4.5,20,45","3,28,42"})
    public void isCorrectTriangleArea (double a, double h, double expectedResult){
        assertEquals(expectedResult,Figures.triangleArea(a,h));
    }

    @ParameterizedTest (name = "Triangle with side {0} and height {1} has not an area {2}")
    @CsvSource({"2,0,1000","4.0,63,585","50,1726,69385","99,307,7514","3.14,28,26"})
    public void isNotCorrectTriangleArea(double a, double h, double expectedResult){
        assertNotEquals(expectedResult,Figures.triangleArea(a,h));
    }

    // TRAPEZE

    // circuit
    @ParameterizedTest (name = "Trapeze with longer base {0}, shorter base {1} and sides {2} has a circumference {3}")
    @CsvSource({"20,10,15,60","10.5,5.5,6.5,29"})
    public void isCorrectTrapezeCircuit(double a, double b, double c, double expectedResult){
        assertEquals(expectedResult,Figures.trapezeCircuit(a,b,c));
    }

    @ParameterizedTest (name = "Trapeze with longer base {0}, shorter base {1} and sides {2} has not a circumference {3}")
    @CsvSource({"40,5,5,50","8.5,7.5,6.5,69.09"})
    public void isNotCorrectTrapezeCircuit(double a, double b, double c, double expectedResult){
        assertNotEquals(expectedResult,Figures.trapezeCircuit(a,b,c));
    }

    // area
    @ParameterizedTest (name = "Trapeze with longer base {0}, shorter base {1} and height {2} has an area {3}")
    @CsvSource({"40,15,10,275","10.5,9.5,4.5,45"})
    public void isCorrectTrapezeArea (double a, double b, double h, double expectedResult){
        assertEquals(expectedResult,Figures.trapezeArea(a,b,h));
    }

    @ParameterizedTest (name = "Trapeze with longer base {0}, shorter base {1} and height {2} has not an area {3}")
    @CsvSource({"2,1,40,1000","64,63,78,58569"})
    public void isNotCorrectTrapezeArea(double a, double b, double h, double expectedResult){
        assertNotEquals(expectedResult,Figures.trapezeArea(a,b,h));
    }

}

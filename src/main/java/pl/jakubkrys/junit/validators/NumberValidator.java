package pl.jakubkrys.junit.validators;

public class NumberValidator {

    public static boolean numberLengthValidation(int number){
        String amount = String.valueOf(number);
        int amountOfDigits = amount.length();
        return amountOfDigits == 3;
    }
}

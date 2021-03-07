package pl.jakubkrys.junit;

public class NumberValidator {

    public static boolean numberLengthValidation(int number){
        String amount = String.valueOf(number);
        int amountOfDigits = amount.length();
        if(amountOfDigits == 3){
            return true;
        } else {
            return false;
        }
    }
}

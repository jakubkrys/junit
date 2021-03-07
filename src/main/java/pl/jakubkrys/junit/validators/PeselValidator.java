package pl.jakubkrys.junit.validators;

public final class PeselValidator {

    public static boolean peselLengthValidation(String pesel) {
       return pesel.length() == 11;
        /*
       lub

       if(pesel.length() == 11){
            return true;
        } else {
            return false;
        }*/
    }

    public static boolean peselDayValidation(String pesel) {
        String day = pesel.substring(4,6);
        int dayNumber = Integer.parseInt(day);
        return dayNumber >= 1 && dayNumber <= 31;
    }
}
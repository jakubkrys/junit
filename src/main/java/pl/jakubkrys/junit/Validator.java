package pl.jakubkrys.junit;

public final class Validator {

    public static boolean peselValidation(String pesel) {
       return pesel.length() == 11;
        /*
       lub

       if(pesel.length() == 11){
            return true;
        } else {
            return false;
        }*/
    }
}

package pl.jakubkrys.junit;

public class Person {

    private String name;
    private String pesel;

    public Person(String name, String pesel) {
        this.name = name;
        this.pesel = pesel;
    }

    public String getYearFromPesel(){
        if (Integer.parseInt(pesel.substring(2,3)) >= 2){
            return "20"+pesel.substring(0,2);
        } else {
            return "19"+pesel.substring(0,2);
        }
    }
}

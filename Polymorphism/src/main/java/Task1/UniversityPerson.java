package Task1;

public class UniversityPerson {
    private String name;
    private int birthYear;

    public UniversityPerson(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName(){return name;}
    public void setName(String name){this.name = name;}
    public int getBirthYear(){return birthYear;}
    public void setBirthYear(int birthYear){this.birthYear=birthYear;}

    public String getRole(){
        return "Unversity Person";
    }
    public int getAge(int currentYear){
        return currentYear - birthYear;
    }

    @Override
    public String toString(){
        return name + "(born " + birthYear + ")";
    }
}

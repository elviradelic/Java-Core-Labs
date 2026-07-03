package Task4;

public class Developer extends Employee implements Reportable{
    private String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage){
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public double calculateBonus(){
        return getSalary()*0.2;
    }

    public String generateReport(){
        return "Report->" + getDetails() + programmingLanguage;
    }
}

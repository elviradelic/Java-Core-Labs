package Task4;

public class Manager extends Employee implements Reportable {
    private int teamSize;

    public Manager(String name, double salary, int teamSize){
        super(name, salary);
        this.teamSize = teamSize;

    }
    public double calculateBonus(){
        return getSalary()*0.3;
    }
    public String generateReport(){
        return getDetails() + teamSize;
    }
}

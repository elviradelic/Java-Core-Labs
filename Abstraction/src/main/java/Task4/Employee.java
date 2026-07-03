package Task4;

public abstract class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public double getSalary(){return salary;}

    public abstract double calculateBonus();

    public String getDetails(){
        return "Name:" + name + "Salary:" + salary;

    }
}

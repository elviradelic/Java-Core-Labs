package Task1;

public class Staff extends UniversityPerson{
    private String staffId;
    private String role;

    public Staff(String name, int birthYear, String staffId, String role) {
        super(name, birthYear);
        this.staffId = staffId;
        this.role = role;
    }

    @Override
    public String  getRole(){
        return "Staff";
    }

    public String getStaffInfo(){
        return getName() + " works as " + role;
    }
}

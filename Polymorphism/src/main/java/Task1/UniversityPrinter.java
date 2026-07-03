package Task1;

public class UniversityPrinter {
    public void printPersonDetails(UniversityPerson person, int currentYear) {
        System.out.println(person.toString());
        System.out.println("Role:" + person.getRole());

        System.out.println("Age:" + person.getAge(currentYear));

        if(person instanceof Student){
            Student s = (Student) person;
            System.out.println(s.getStudentInfo());


        }

        if(person instanceof Professor){
            Professor p = (Professor) person;
            System.out.println(p.getProfessorInfo());
        }

        if(person instanceof Staff){
            Staff f = (Staff) person;
            System.out.println(f.getStaffInfo());
        }





    }
    }

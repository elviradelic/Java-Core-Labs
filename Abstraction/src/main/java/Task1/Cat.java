package Task1;

public class Cat extends Animal {
    public Cat(String name){
        super(name);
    }
    @Override
    public void makeSound(){
        System.out.println("Meeeeow");
    }

    public String  purr(){
        return getName() + " is puuuur";
    }
}

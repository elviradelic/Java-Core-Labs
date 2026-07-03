package Task1;

public class Dog extends Animal{
    public Dog(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("wOOF!");
    }

    public String fetch(){
        return getName() + " is fetching";
    }
}

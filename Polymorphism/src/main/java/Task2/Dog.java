package Task2;

public class Dog extends Animal{

    public Dog(String name){
        super(name);
    }

    @Override
    public void speak(){
        System.out.println("Woof!");
    }

    public String fetchBall(){
        return getName() + "fetch a Ball";
    }

}

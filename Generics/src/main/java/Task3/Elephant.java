package Task3;

public class Elephant extends Animal implements Comparable<Elephant>{
    public Elephant(String name, int age){
        super(name, age);
    }

    @Override
    public void speak(){
        System.out.println(getName() + "is sniiiiif");
    }

    @Override
    public int compareTo(Elephant other){
        return Integer.compare(this.getAge(), other.getAge());
    }
}


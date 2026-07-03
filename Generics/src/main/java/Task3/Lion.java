package Task3;

public class Lion extends Animal implements  Comparable<Lion>{

    public Lion(String name, int age){
        super(name, age);
    }

    @Override
    public void speak(){
        System.out.println(getName() + "roaaaaar");
    }


    @Override
    public int compareTo(Lion other){
        return Integer.compare(this.getAge(), other.getAge());
    }

}

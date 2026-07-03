package Task3;

record Person(String name, int age, int height)
{
    public static Person createAnonymous(){
        return new Person("Anonzymus", 0, 0);
    }
}

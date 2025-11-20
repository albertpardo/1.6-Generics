package level2ex2;

public class Person {
    private String name;
    private String lastname;
    private int age;

    public Person( String name , String lastname, int age){
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    @Override
    public String toString(){
        return ("(person's data) -> name = '" + name + "', lastName = '" + lastname + "', age = '" + age + "'");
    }
}

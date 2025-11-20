package level1ex2;

public class Person {
    private String name;
    private String lastName;
    private int age;

    public Person( String name , String lastName,int age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString(){
        return ("(person's data) -> name = '" + name + "', lastName = '" + lastName + "', age = '" + age + "'");
    }
}

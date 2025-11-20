package level2ex1;

public class Main {
    public static void main(String[] args){
        Person person = new Person("Carla", "Bonnetti", 23);
        int number = 3000;
        boolean booleanVar = false;
        GenericMethods.genericPrint(person, number, booleanVar);
    }
}

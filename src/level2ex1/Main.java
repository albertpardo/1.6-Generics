package level2ex1;

import level1ex2.model.GenericMethods;
import level2ex1.model.Person;

public class Main {
    public static void main(String[] args){
        Person person = new Person("Carla", "Bonnetti", 23);
        int number = 3000;
        boolean booleanVar = false;
        System.out.println("--- GenericMethods using the same objects in different order:  ");
        GenericMethods.genericPrint(person, number, booleanVar);
        System.out.println("--- GenericMethods using the same objects in different order:  ");
        GenericMethods.genericPrint(number, booleanVar, person);
        System.out.println("--- GenericMethods using the same objects in different order:  ");
        GenericMethods.genericPrint(booleanVar, person, number);
    }
}

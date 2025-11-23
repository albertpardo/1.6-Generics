package level3ex1.model;

import level3ex1.interfaces.Phone;

public class Smartphone implements Phone {
    private String name;

    public Smartphone(String name){
        this.name = name;
    }
    @Override
    public void call() {
        System.out.println("Smartphone '" + name + "' is calling!");
    }

    public void takePhoto(){
        System.out.println("Smartphone '" + name + "' is taking a photo!");
    }
}

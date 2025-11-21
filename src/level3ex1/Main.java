package level3ex1;

import java.sql.SQLSyntaxErrorException;

public class Main {
    public static void  main(String[] args){
        Smartphone smartphone = new Smartphone("smartphone");
        Generic genericObject = new Generic();

        System.out.println("--- call Generic.executePhoneMethods() with smartphone---");
        genericObject.executePhoneMethods(smartphone);
        System.out.println();
        System.out.println("--- call Generic.executeSmartphoneMethods() with smartphone ---");
        genericObject.executeSmartphoneMethods(smartphone);

        // On the next commented code , Intellij give an error because string is not implementing the Phone's interface
/*
        try{
            String string = "Hola!";

            genericObject.makeCall(string);
        }
        catch (Exception e){
            System.out.println("ERROR: " + e.getMessage());
        }
  */
    }
}

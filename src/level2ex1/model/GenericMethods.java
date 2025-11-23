package level2ex1.model;

public class GenericMethods {
    public static <T1, T2> void genericPrint(T1 varOne, T2 varTwo, boolean varThree){
        System.out.println("T1 -> {" + varOne + "}");
        System.out.println("T2 -> {" + varTwo + "}");
        System.out.println("boolean var -> {" + varThree + "}" );
    }
}

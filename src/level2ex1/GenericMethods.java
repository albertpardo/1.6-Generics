package level2ex1;

public class GenericMethods {
    public static <T1, T2, T3> void genericPrint(T1 varOne, T2 varTwo, T3 varThree){
        System.out.println("T1 = '" + varOne + "'");
        System.out.println("T2 = '" + varTwo + "'");
        System.out.println("T3 = '" + varThree + "'" );
    }
}

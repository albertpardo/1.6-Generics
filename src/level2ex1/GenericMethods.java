package level2ex1;

public class GenericMethods {
    @SafeVarargs
    public static <T> void genericPrint(T... arguments){
        for (T argument : arguments){
            System.out.println(argument);
        }
    }
}

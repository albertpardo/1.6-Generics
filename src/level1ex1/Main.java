package level1ex1;

public class Main {
    public static void main(String[] args){
        NoGenericMethods noGenericMethods1 = new NoGenericMethods("Hello" , "Question?", "Say something");
        NoGenericMethods noGenericMethods2 = new NoGenericMethods("Question?", "Say something", "Hello");
        NoGenericMethods noGenericMethods3 = new NoGenericMethods("Say something", "Hello", "Question?");

        System.out.println("Objects without generics with arguments in different positions:");
        System.out.println("'noGenericMethods1' contents -> " + noGenericMethods1.toString());
        System.out.println("'noGenericMethods2' contents -> " + noGenericMethods2.toString());
        System.out.println("'noGenericMethods3' contents -> " + noGenericMethods3.toString());
    }
}

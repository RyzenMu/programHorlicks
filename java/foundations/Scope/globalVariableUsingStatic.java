public class globalVariableUsingStatic {

    static String firstMessage = " this is a global variable";

    public static void main(String[] args){
        System.out.println(firstMessage);
        myMethod();
    }

    static void myMethod(){
        System.out.println(firstMessage + " From Method");
        }
    
}

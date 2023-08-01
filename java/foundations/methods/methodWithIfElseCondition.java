import java.io.Console;

public class methodWithIfElseCondition {
    
    static void myMethod(int age){

        if (age < 18) {
            System.out.println("Access Denied");
        }
        else if (age >= 18 && age <= 40){
            System.out.println("Some Acess permitted");
        }
        else {
            System.out.println("Full access granted");
        }
        
    }

    public static void main(String[] args){
        myMethod(35);
        myMethod(8);
        myMethod(56);
    }
}

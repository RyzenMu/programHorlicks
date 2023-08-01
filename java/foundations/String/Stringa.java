
public class Stringa {

    public static void main(String[] args) {

        String greeting = "hello";
        String greeting1 = "WWW";

        String greeting3 = greeting + "   " + greeting1 ;

        System.out.println(greeting3);


        // length of the string
        System.out.println(greeting3.length());
        
        
        
        // to upperCASe method
        System.out.println(greeting3.toUpperCase());


        System.out.println("-------------");


        // to lower method
        System.out.println(greeting3.toLowerCase());


        // indexof method
        System.out.println(greeting3.indexOf("WWW"));


        //concat() method
        String greeting4 = ", Welcome to the world";

        System.out.println(greeting3.concat(greeting4));
        System.out.println(greeting4.concat(greeting4));
        System.out.println(greeting4.concat("  "+greeting3));


        
    }
}

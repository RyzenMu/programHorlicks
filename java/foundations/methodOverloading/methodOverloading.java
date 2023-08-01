
public class methodOverloading {

    static void myMethod(){
        System.out.println("This is Method one");
    }
    
    
    static void myMethod(int l){
        System.out.println("This is Method two  " + l);
    }

    public static void main(String[] args){
        myMethod(55);
        myMethod();
    }
}

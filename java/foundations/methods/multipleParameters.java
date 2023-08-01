public class multipleParameters {

    static void myMethod(String fname, int age){
        System.out.println("the name is :" + fname + " Refsnes");
        System.out.println(" the age is : " + age);
        System.out.println();
    }

    public static void main(String[] args){
        myMethod("Liam", 5);
        myMethod("Jenny", 8);
        myMethod("Anja", 31);


    }
    
}

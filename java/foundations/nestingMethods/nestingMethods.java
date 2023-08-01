
public class nestingMethods {

    public static void main(String args[]){
        Num n1 = new Num();
        n1.num1 = 17;
        n1.num2 = 19;
        int result = n1.method1();
        System.out.println(result);
        int result1 = n1.method2();
        System.out.println(result1);
    }

    
}

class Num{
    
    int num1;
    int num2;

    int method1(){
        return num1 + num2;
    }

    int method2(){
        int m1 = method1();
        return m1 + 10;
    }


}

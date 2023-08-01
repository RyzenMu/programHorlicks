class Class1 {
    int a;
    Class1(int a){
        
    }
    public void print(){
        System.out.println("The value is : " + a);
    }
}

public class instaneOfOperator {
    
    public static void main(String args[]){
        String h = "Fast x is a watchable movie";
        System.out.println( h instanceof String);

        Class1 c1 = new Class1(16);
        c1.print();

        System.out.println(c1 instanceof Class1);       

    }
}

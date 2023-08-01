final class A{
    int variable1 = 4;
    void print(){
        System.out.println(variable1);
    }
}

// class B extends A{

// } class B cannot inherrit final class



public class finalClass {

    public static void main(String args[]){
        A a1 = new A();
        a1.variable1 = 22;
        a1.print();
    }
    
}

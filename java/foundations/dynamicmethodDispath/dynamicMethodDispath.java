class Super{
    public void method(){
        System.out.println("Method Super");
    }

}

class Sub extends Super{
    public void method(){
        System.out.println("Method Sub");
    }
}
public class dynamicMethodDispath {
    public static void main(String args[]){
        Super A = new Sub(); // Sub's object reference assigned Super type reference variable
        A.method();
        

    }
}

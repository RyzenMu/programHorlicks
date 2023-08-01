
class myGeneric<T1> {
    int val = 97;
    private T1 t1;

    //constructor
    public myGeneric(int val, T1 t1){
        this.val = val;
        this.t1 = t1;
    }

    //getter
    public int getVal(){
        return val;
    }

    //setter
    public void setVal(int val){
        this.val = val;
    }
}

public class genericsClass {
    
    public static void main(String args[]){

        myGeneric g1 = new myGeneric(23, "myString");
        int a = g1.getVal();
        System.out.println(a);
    }
}

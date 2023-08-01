class Monitor{
    void meth(){
        System.out.println("This is a Monitor");
    }
}

class Intex_CRT extends Monitor{
    void meth(){
        System.out.println("This is a Intex");
    }
}


public class DMD {
    public static void main(String args[]){
        Monitor M1 = new Intex_CRT();
        M1.meth();
    }
    
    
}

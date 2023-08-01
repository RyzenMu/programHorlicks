public class varArgs2 {
    varArgs2(String... person){
        for(String name : person){
            System.out.println("Hello " + name);
        }
    }
    public static void main(String args[])
    {
        varArgs2 v = new varArgs2("John", "David", "Suhel", "muruga", "nantham");
        varArgs2 f = new varArgs2();
        // System.out.println(v);
    }
    
}



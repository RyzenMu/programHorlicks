public class con1 {
    public static void main(String[] args){
        Bed r67 = new Bed(1, "Green");
        r67.info();
    }
    
}

class Bed{
    int size;
    String color;
    Bed (int sizea, String colora){
        size = sizea;
        color = colora;
    }
    void info(){
        System.out.println("The size of the bed is :" + size);
        System.out.println("The color of the bed is :"+ color);
    }
}

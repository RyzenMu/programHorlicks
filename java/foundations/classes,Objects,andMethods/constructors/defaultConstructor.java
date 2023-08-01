public class defaultConstructor {

    public static void main(String args[]){
        Latop l1 = new Latop();
        l1.screenSize = 14;
        l1.cores = 2;
        l1.ram = 4;
        l1.color = "black";
        l1.print();

        Latop l2 = new Latop();
        l2.print();
    }
    
}

class Latop{
    int screenSize;
    int cores;
    int ram;
    String color;

    //default constructor
    Latop(){
        screenSize = 0;
        cores = 0;
        ram = 0;
        color = "";
        }
    void print(){
        System.out.println("The Screen size is :" + screenSize);
        System.out.println("The number of cores is :" + cores);
        System.out.println("The Ram size is :" + ram);
        System.out.println("The color is :" + color);



    }
}


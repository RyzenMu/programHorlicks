
public class Inheritance {

    public static void main(String args[]){

        Karchief k1 = new Karchief(80, 60, "blue-red", 30);
        int folding1 = k1.folding();
        int area1 = k1.area();
        int life1 = k1.life();
        Karchief_1 k2 = new Karchief_1(56, 65, "red", 76);
        int usage1 = k2.usage();
        System.out.println(area1);
        System.out.println(life1);
        System.out.println(folding1);
        System.out.println(usage1);



    }
}

class Karchief {
    int length;
    int breadth;
    String color;
    int price;
    Karchief(int lengtha, int breadtha, String colora, int pricea){
        length = lengtha;
        breadth = breadtha;
        color = colora;
        price = pricea;
    };
    int folding(){
        return (length*breadth/400);
    }
    int area(){
        return (length * breadth);
    }
    int life(){
        return (area()*20/100);
    }

    public Karchief(){

    }

}

class Karchief_1 extends Karchief{

    Karchief_1(int lengtha, int breadtha, String colora, int pricea){
        length = lengtha;
        breadth = breadtha;
        color = colora;
        price = pricea;}

    int usage(){
        return (life()/2);
    }

}

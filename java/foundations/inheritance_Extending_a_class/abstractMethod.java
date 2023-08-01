public class abstractMethod {
    public static void main(String args[]){
        Pant p1 = new Pant(1000, 32, "black");
        System.out.println(p1.color);
        System.out.println(p1.Size);
        System.out.println(p1.Bill());
        System.out.println(p1.tax());


    }
}

abstract class Pant{
    int price;
    int Size;
    String color;
    Pant(int pricea, int Sizea, String colora){
        price = pricea;
        Size = Sizea;
        color = colora;
    }
    int Bill(){
        int finalprice;
        finalprice = price * 75 / 100;
        return (finalprice);
    }
    abstract double tax();

}

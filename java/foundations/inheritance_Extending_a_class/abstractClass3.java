public class abstractClass3 {
    public static void main(String args[]){
        // Area a1 = new Area(2, 4); Cannot instantiate a new abstract class
        
    }
}

abstract class Area{
    int x;
    int y;
    Area(int x, int y){
        x = x;
        y = y;
    }
    void AreaResult(){
        System.out.println(x*y);
    }

}

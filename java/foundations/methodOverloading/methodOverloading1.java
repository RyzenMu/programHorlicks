public class methodOverloading1 {

    static int plusMethod(int x, int y){
        return x + y;
    }
    
    static double plusMethod(double x, double y){
        return x + y;
    }

    public static void main(String[] args){
        int intasum = plusMethod(531, 635);
        double doubleasum = plusMethod(5.431, 5.421);
        System.out.println("Int :" + intasum);
        System.out.println("double :" + doubleasum);
    }
}


public class Recursionsa {

    static int fac(int w){
        if (w == 1){
            return 1;
        }
        return w * fac(w-1);
    }

    public static void main(String[] args){
        int result = fac(5);
        System.out.println(result);
    }
}

public class storeResultInaVariable {

    static int myMethod(int x, int y){
        return x + y;
    }

    public static void main(String[] args){
        int result = myMethod(531, 65465);
        System.out.println(result);
    }
    
}

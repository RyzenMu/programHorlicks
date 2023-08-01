

public class varArgs{
    public static void main(String[] args){
        System.out.println(print(2, 3, 9, 6));
        
    }

    public static int print(int... a){
        int result;
        result =0;
        for (int i : a){
            result += i;
        }
        return result;
        
    }
}
public class addingNumbers {

    static int add(int e){

        if (e == 0){
            return 0;
        }
        
        int result = 0;
        
        result = e + add(e-1);

        return result;
    }

    public static void main(String[] args){
        System.out.println(add(10));
    }
    
}

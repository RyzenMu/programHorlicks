public class endStart {

    static int sum(int start, int end){

        if (start < end){
            return start + sum(start+1, end);
        }
        else if (start == end){
            return start;
        }
        else{
            return 0;
        }

    }

    public static void main(String[] args){
        int result = sum(15, 18);
        System.out.println(result);
    }
    
}

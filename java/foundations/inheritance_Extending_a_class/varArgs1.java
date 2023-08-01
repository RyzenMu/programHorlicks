public class varArgs1 {
    public static void main(String args[]){
        bb b1 = new bb();
        System.out.println(b1.sum(2, 4, 6, 7, 8, 1, 5, 22));

    }
    
}

class bb{
    int sum(int... ccc){
        int sum = 0;
        for (int i : ccc){
            sum += i;
        }
        return sum;
    }

}

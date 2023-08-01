public class logicalOperators {
    // and or not  (&& || !)

    public static void main(String args[]){
        int a = 5, b = 10, c = 15;
        if ((a>b) && (c > b)){
            System.out.println(("first condition saitsfied"));
        }
        else if ((a >b) || (c > b)){
            System.out.println("Second condition satisfied");
        }
        else if (a != b){
            System.out.println("third condition satisfied");
        }
        else {
            System.out.println("last condition satisfied");
        }
    }
}



public class TypeCasting {

    public static void main(String[] args) {


    // widening casting
    int myInt = 9;
    double myDouble = myInt; // automatic casting : int to double
    System.out.println(myInt);
    System.out.println(myDouble);


    //narrowing casting
    double myOtherDouble = 9.8445d;
    int myOtherInt = (int) myOtherDouble;
    System.out.println(myOtherDouble);
    System.out.println(myOtherInt);

    }
    
}

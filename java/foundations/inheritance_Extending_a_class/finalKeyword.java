//Final key word

//final variables and final methods

class Phone {
    static double screenSize = 6.5;
    final int price = 7000;
    final void print(){
        System.out.println("The Screen size is : "+ screenSize);
        System.out.println("The price is : "+ price);
    }
}

class AndroidPhone extends Phone {
    // void print(){
        
    // } // cannot override the function
    int price = 4000;
    // The variable can be overridden
}




public class finalKeyword {
    public static void main(String args[]){

        Phone p1 = new Phone();
        System.out.println(p1.screenSize);
        System.out.println(p1.price);

        p1.screenSize = 6.7;
        // p1.price = 6000;// the final field.Phone.price cannot be assigned
        System.out.println(p1.screenSize);

    }
}

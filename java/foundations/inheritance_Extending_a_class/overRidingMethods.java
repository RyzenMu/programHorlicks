class Fruits{
    String name;
    int antioxidants;
    Fruits(String namea, int antioxidantsa){
        name = namea;
        antioxidants = antioxidantsa;
    }
    int antioxidants(){
        return antioxidants*4;
    }
}

class CitricFruits extends Fruits{
    CitricFruits(String namea, int antioxidantsa){
        super(namea, antioxidantsa);
    }
    int antioxidants(){
        return antioxidants * 6;
    }    
}

class SweetFruits extends Fruits{
    SweetFruits(String namea, int antioxidantsa){
        super(namea, antioxidantsa);
    }
    int antioxidants(){
        return antioxidants*2;
    }
}

public class overRidingMethods {

    public static void main(String args[]){
        Fruits f1 = new Fruits("Apple", 5);
        System.out.println(f1.antioxidants());

        CitricFruits c1 = new CitricFruits("Orange", 2);
        System.out.println(c1.antioxidants());

        SweetFruits s1 = new SweetFruits("Grapes", 3);
        System.out.println(s1.antioxidants());

    }
    
    
}

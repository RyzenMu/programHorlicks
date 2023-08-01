class Animals{
    String name;
    int life;
    Animals(String nam, int lif){
        name = nam;
        life = lif;
    
    }
    void printa(){
        System.out.println(("The name of animal is : "+ name));
        System.out.println("The age of the Lion is : " + life);
    }
}
class WildAnimals extends Animals{
    String name;
    int life;
    WildAnimals(String nam, int lif){
        super(nam, lif);
        
    }
}
class Lion extends WildAnimals{
    String name;
    int life;
    Lion(String nam, int lif){
        super(nam, lif);
        
    } 
}


public class Multi_level_inheritance {

    public static void main(String args[]){
        Lion l1 = new Lion("federar", 70);
        l1.printa();
    }
    
}

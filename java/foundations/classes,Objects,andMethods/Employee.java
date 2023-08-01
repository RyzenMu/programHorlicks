public class Employee {

    public static void main(String[] args){
        Emp e1 = new Emp();
        e1.getDetails(70792, "Muruga");
        e1.display();

        Emp e2 = new Emp();
        e2.getDetails(2311, "Muruga Menon");
        e2.display();

        Emp e3 = new Emp();
        e3.getDetails(3563, "Muruga Goankar");
        e3.display();
    }
    
}


class Emp {
    int serialNumber;
    String name;
    void getDetails(int serialNumbera, String namea){
        serialNumber = serialNumbera;
        name = namea;
    }
    void display(){
        System.out.println("Welcome to the Office : " + name);
        System.out.println("Your ID number is : "+ serialNumber);
    }

} 

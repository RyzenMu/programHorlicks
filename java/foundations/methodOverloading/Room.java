public class Room {

    float length;
    float breadth;
    Room (float x, float y){
        length = x;
        breadth = y;
    }
    Room (float x){
        length = breadth = x;
    }
    float area(){
        return (length * breadth);
    }

public static void main(String args[]){
    Room r1 = new Room(21, 5);
    System.out.println(r1.area());
    Room r2 =  new Room(33);
    System.out.println(r2.area());
}

}






class Room1 {
    float length;
    float breadth;
    Room1(float x, float y){
        length = x;
        breadth = y;
    }
    float area(){
        return (length*breadth);
    }
}

class BedRoom extends Room1 {
    float height;
    float breadth;
    BedRoom(float x, float y, float z){
        super (x, y); // pass values to super class
        height = z;
    }
    float volume1(){
        return (area() * height);
    }
}



class Example1 {

    public static void main(String args[]){
        // Application of single inheritance
        BedRoom room11 = new BedRoom(14,12, 10);
        float area1 = room11.area();
        float volume1 = room11.volume1();
        System.out.println("Area 1 :" + area1);
        System.out.println("Volume 1 : " + volume1);

    }
    

}

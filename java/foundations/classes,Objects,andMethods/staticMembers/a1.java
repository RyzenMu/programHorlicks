
public class a1 {
    public static void main(String args[]){
        Bus.busNo = 128;
        System.out.println(" The Bus Number is " + Bus.busNo);
        Bus.printBusNo();

        Bus b1 = new Bus();
        b1.noOfTrips = 99;
        b1.printNoOfTrips();


    }    
}

class Bus{
    static int busNo;
    static void printBusNo(){
        System.out.println("The Bus Number is ::::" +busNo);
    }
    int noOfTrips;
    void printNoOfTrips(){
        System.out.println("Number of Trips is " + noOfTrips);
    }
}

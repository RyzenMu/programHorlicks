public class methover {

    public static void main(String[] args){
        Studenta s1 = new Studenta(1233);
        s1.rollNo = 5465;
        s1.show1();
    
    }
    
}

class Studenta
{
    int rollNo;
    // String name;
    // String subject;
    // constructor with Roll Number alone
    Studenta(int x){
        rollNo = x;
    }
    // Student(int x, String y){
    //     rollNo = x;
    //     name = y;
    // }
    // Student(int x, String y, String z){
    //     rollNo = x;
    //     name = y;
    //     subject = z;
    // }
    void show1(){
        System.out.println(rollNo);
        // System.out.println(name);
        // System.out.println(subject);

        }
    }




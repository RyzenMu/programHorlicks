class Pen {
    String color;
    String type;

    public void write(){
        System.out.println("writing Something");
    }

    public void printColor(){
        System.out.println(this.color);
    }

}

class Student {
    String name;
    int age;

    public void printName(){
        System.out.println(this.name);
    }

    public void printAge(){
        System.out.println(this.age);
    }

    Student(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("constructor called");
        System.out.println(" Student name inner " + this.name);
        System.out.println(" Student age - inner " + this.age);
    }
}





public class oopsa {

    public static void main(String[] args){
        Pen pen1 = new Pen();
        pen1.color = " Black ";
        pen1.type = "Ball Point";
        pen1.write();

        System.out.println("This is java OOPS");

        Pen pen2 = new Pen();
        pen2.color = "\tPink";
        pen2.type = "\t gel";

        pen1.printColor();
        pen2.printColor();


        Student student1 = new Student("aman", 24);
        student1.name = "Vatthi";
        student1.age = 33;

        student1.printName();
        student1.printAge();
    }

}
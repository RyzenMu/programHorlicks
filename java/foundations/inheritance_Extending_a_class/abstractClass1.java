public class abstractClass1 {
    public static void main(String args[]){
        funk1();
        funk2();
        Person p1 = new Person("Apeil", 12);
        p1.details();
        
    }
    static void funk1(){
        System.out.println("This is function 1");
    }
    static void funk2(){
        System.out.println("This is function 2");
    }
}

class Person{
    String name;
    int age;
    Person(String namea, int agea){
        name = namea;
        age = agea;
    }
    void details(){
        System.out.println("The Name of the Person is :" + name);
        System.out.println("The Age of the Person is :" + age);

    }
}

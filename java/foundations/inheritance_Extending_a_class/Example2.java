class Calc{
    public int add(int n1, int n2){
        return n1+n2;
    }
    public int sub(int n1, int n2){
        return n1-n2;
    }
}

class AdvCalc extends Calc{
    public int mul(int n1, int n2){
        return n1*n2;
    }
    public int div(int n1, int n2){
        return n1/n2;
    }

}



public class Example2 {
    public static void main(String args[]){

        Calc obj = new Calc();
        int r1 = obj.sub(3, 7);
        System.out.println(r1);

        AdvCalc obja = new AdvCalc();
        int r2 = obja.add(10, 10);
        System.out.println(r2);
        int r3 = obja.sub(100, 10);
        System.out.println(r3);
        int r4 = obja.mul(10, 10);
        System.out.println(r4);
        int r5 = obja.div(10, 10);
        System.out.println(r5);

        }
}

public class AssigningReferenceToSameObjects {
    public static void main(String[] args)
    {
        System.out.println("hello");

        Rectangle r = new Rectangle();
        r.length = 10;
        System.out.println((r.length));
        Rectangle r2 = r;
        r2.length = 20;
        System.out.println((r2.length));
        Rectangle r3 = new Rectangle();
        r3.length = 30;
        System.out.println(r3.length);
        Rectangle r4 = new Rectangle();
        r4.getData(40, 20);
        System.out.println(r4.length);
        System.out.println(r4.area());

    }
}

class Rectangle
{
    int width;
    int length;

    int area()
    {
        int a = width * length;
        return a;
    }

    void getData(int x, int y)
    {
        length = x;
        width = y;
    }

}
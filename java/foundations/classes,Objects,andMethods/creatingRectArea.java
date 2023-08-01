class Rect
{
    int width;
    int length;

    int rectArea()
    {
        int a = width * length;
        return a;
    }

    void print()
    {
        int w = width;
        int l = length;
        System.out.println(w);
        System.out.println(l);
    }
}

public class creatingRectArea {

    public static void main(String[] args)
    {
        Rect r = new Rect();
        r.length = 24;
        r.width = 97;
        int a = r.rectArea();
        System.out.println(a);
        System.out.println(" _____________________");
        r.print();
    }
    
}

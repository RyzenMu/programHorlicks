// in java the data items are called fields and functions are called methods

class Rectangle
     {
        int length;
        int width;
        void getData (int x, int y) // Method Declaration
        {
            length = x;
            width = y;
        }

        int rectArea()
        {
            int area = length * width;
            return area;
        }
     }

     
public class definingAClass {
    /*
     * class className [extends superClassName]
     * {
     *      [fields declaration;]
     *      [methods declaration;]
     * }
     * 
     * 
     * FIELD DECLARATION
     * class Rectangle 
     * {
     *      int length;
     *      int width;
     * }
     * 
     * METHOD DECLARATION
     * type methodName (parameter-list)
     * {
     *      method-body;
     * }
     */

     

     public static void main(String[] args)
     {
        Rectangle r1 = new Rectangle();

        r1.length = 10;
        r1.width = 10;
        int a = r1.rectArea();
        System.out.println(a);
     }
    
}

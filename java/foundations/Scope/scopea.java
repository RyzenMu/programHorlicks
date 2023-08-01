
public class scopea {

    class Reference {
        public static final double root2 = 1.41;
        public static final double pi = 3.14;
        public static final double MaxLength = 12;
    }

    

    public class Circle {


        public static double area(double radius){
            double circleArea = Reference.pi * radius * radius;
            return circleArea;
        }

        public static void main(String[] args){

            System.out.println(area(241));
        }
    }
    
}

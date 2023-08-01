public class Numbers {

    public static void main(String[] args)  {

        // byte will contain numbers between -128 to 127 only
        byte myNum = 100;
        // byte myNewNum = 255; // cannot convert int to byte
        System.out.println(myNum);


        // short will contain numbers between -32768 to 32767
        short shortNum = 4211;
        // short shortNum = 42111; // cannot convert from int to short
        System.out.println(shortNum);


        //int data type stores whole numbers from -2147483648 to 2147483647
        int myIntNum = 1000000;
        // int myIntNum1 = 12345678910111213; // the literal of int out of range
        System.out.println(myIntNum);


        // long - -9223372036854775808 to 9223372036854775807
        long myLongNum = 1245487541545997L;
        System.out.println(myLongNum);


        // float and double
        float f1 = 5.4515f;
        System.out.println(f1);
        float f2 = 5.474771454515f;
        System.out.println(f2);// precision upto 4 digits
        double d1 = 5.474771454515d;
        System.out.println(d1);// double has more precision than float


        //scientific numbers
        float f3 = 35e3f;
        float f4 = 35E3f;
        double d2 = 12E4d;
        System.out.println(f3);
        System.out.println(f4);
        System.out.println(d2);


        
        

        
        






    }
}
public class Matha {

    public static void main(String[] args) {

        // Math operations in Java


        // 1. Maximum number in Math
        int maximum_number = Math.max(100, 20);
        System.out.println(maximum_number);


        // 2.Minimum of two numbers
        int minimum_number = Math.min(100, 200);
        System.out.println(minimum_number);


        // 3.Square root of a number
        int sqrt_number = (int) Math.sqrt(64);
        System.out.println(sqrt_number);


        // 4.absolute returns the positive of a number
        int absNumber = Math.abs(-44);
        System.out.println(absNumber);

        // 5.Ceil and Floor of a number
        float number1 = 5.55f;
        System.out.println(" Ceil of 5.55 is : " +Math.ceil(number1));
        System.out.println(" Floor of 5.55 is : " + Math.floor(number1));


        // 6. Random numbers gives values from 0.0 to 1.0(excluding)
        double ranNumbers = Math.random();
        System.out.println(Math.ceil(ranNumbers*100));


        // 7. Round function in java
        System.out.println(Math.round(ranNumbers*100));


    }
}

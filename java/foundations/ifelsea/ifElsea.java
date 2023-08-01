

public class ifElsea {

    public static void main(String[] args) {

        int todayWeather = 48;

        if (todayWeather >=15 && todayWeather <=22){
            System.out.println("Cold Weather");
        }
        else if (todayWeather >=23 && todayWeather <= 31){
            System.out.println("Normal Weather");
        }
        else if (todayWeather >=32 && todayWeather <= 40){
            System.out.println("Hot weather");
        }
        else{
            System.out.println("Please enter a correct number");
        }

        // short hand if else

        String myNum = (117 >= 23) ? "seventeen" : "twenty three";

        System.out.println(myNum);
    }
}
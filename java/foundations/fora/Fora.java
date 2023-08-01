
// for loop

public class Fora {

    public static void main(String[] args) {

        int f = 0;

        for (f = 1; f <=5; f++){
            System.out.println(f);
        }

        System.out.println("--------------------");

        // Nested for loop

        for (int g = 1; g <= 3; g++){
            for(int h = 1; h <= 3; h++){
                System.out.println(g*h);
            }
        }


        // for _Each Array
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String j : cars){
            System.out.println(j);
        }

        System.out.println("--------------------------");

        //@nd example for-each loop
        String[] k = {"Chola", "Chera", "Pandias", "pallva", "devars", "rashtrakutas"};
        for (String king: k){
            System.out.println(king);
        }
    }
}

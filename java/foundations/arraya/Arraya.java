

// arrays

public class Arraya {

    public static void main(String[] args){

        String[] mobiles = {"lava", "micromax", "inflinix", "itel", "Karbonn", "samsung", "Nokia"};

        mobiles[0]  = "spice";

        for (String mob : mobiles){
            System.out.println(mob);
        }

        int[] mob_rates = {7000, 11000, 6500, 2000, 15000};

        for (int mob : mob_rates){
            System.out.println(mob);
        }

        for (int w =0; w < mobiles.length; w++){
            System.out.println("the price of " + mobiles[w] + " is " + mob_rates[w]);
            System.out.println("the price of " + mobiles[w] + " is " + mob_rates[w]);
            System.out.println("the price of " + mobiles[w] + " is " + mob_rates[w]);
            System.out.println("the price of " + mobiles[w] + " is " + mob_rates[w]);



        }


        // multi- dimensional arrays

        int[][] ara =  { { 1, 2, 3, 4}, { 5 , 6, 7}, { 8 , 9, 10 }};

        System.out.println(ara[1][0]);

        // loop through multidimensional array
        for (int e = 0; e < ara.length; e++){
            for (int r = 0; r < ara[e].length; r++){
                System.out.println(ara[e][r]);
            }
        }
    }
}

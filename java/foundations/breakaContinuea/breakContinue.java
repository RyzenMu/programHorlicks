
public class breakContinue {

    public static void main(String[] args){

        // break statement

        for(int l = 1; l <= 10; l++){

            
            
            for (int q = 1; q <= 10; q++){

                System.out.println(l + " " + q);

                if (l == 5){
                    break;
                }
                
            }
        }

        System.out.println("--------------------");

        // continue statement

        for(int l = 1; l <= 10; l++){

            if (l == 10){
                continue;
            }
           
            for (int q = 1; q <= 10; q++){
                if (l >= 2 && l <= 9){
                    continue;
                }
                System.out.println(l + " " + q);

               
                
            }
        }


    }
}
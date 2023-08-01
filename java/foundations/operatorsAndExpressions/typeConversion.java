public class typeConversion {
    public static void main(String args[]){
        int maleVoters = 30000000, femaleVoters = 32600000;

        int ratio = femaleVoters / maleVoters;

        System.out.println(ratio);

        float ratio1 = (float) femaleVoters / maleVoters;

        System.out.println(ratio1);

        int x = (int) 6.9;
        System.out.println(x);// 6.9 is converted to integer by truncation
        
        int a = (int) 21.3 / (int) 4.5;
        System.out.println(a);

        double b = (double) 21.3 / (double) 4.5;
        System.out.println(b);

        float c = (float) 21.3 / (float) 4.5;
        System.out.println(c);

    }
}

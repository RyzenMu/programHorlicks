class Account{
    int accountNumber;
    String name;
    int amount;
}

class Savings extends Account{
    int minimumBalance;
    double maturity(){
        return (amount + (amount*3.25/100/4));
    }
}

class Fixed extends Account{
    int tenure;
    int maturity(){
        return ((amount*7/100*2)+amount);
    }
}




public class hierarchical_Inheritance {

    public static void main(String args[]){
        Fixed f1 = new Fixed();
        f1.accountNumber = 26328370;
        f1.name = "Muruganantham";
        f1.amount = 100000;
        f1.tenure = 2;
        System.out.println("The maturity on fixed is : " + f1.maturity());

        Savings s1 = new Savings();
        s1.accountNumber = 87874;
        s1.name = "Gaurav";
        s1.amount = 100000;
        s1.minimumBalance = 1000;
        System.out.println("The maturity on Savings is : " + s1.maturity());

        

    }
    
}

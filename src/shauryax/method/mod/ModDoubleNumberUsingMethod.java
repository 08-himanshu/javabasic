package shauryax.method.mod;

public class ModDoubleNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        ModDoubleNumberUsingMethod ModDoubleTypeNumber = new ModDoubleNumberUsingMethod();
        //Method Call
        ModDoubleTypeNumber.FirstModDoubleTypeNumberUsingMethod();    //First Method
        //Method Call
        ModDoubleTypeNumber.SecondModDoubleTypeNumberUsingMethod(54D, 65D);    //First Method
        //Store Method in Variable & Method Call
        Double third = ModDoubleTypeNumber.ThirdModDoubleTypeNumberUsingMethod();   //Third Method
        System.out.println("The Mod is\t" + third);
        //Store Method in Variable & Method Call
        Double forth = ModDoubleTypeNumber.ForthModDoubleTypeNumberUsingMethod(83D, 73D);   //Forth Method
        System.out.println("The Mod is\t" + forth);
    }
    //First Method
    public void FirstModDoubleTypeNumberUsingMethod() {
        Double num1 = 873D;
        Double num2 = 763D;
        Double Mod = num1 % num2;
        System.out.println("The Mod is\t" + Mod);
    }
    //Second Method
    public void SecondModDoubleTypeNumberUsingMethod(Double firstNumber,Double secondNumber) {
        Double num1 = firstNumber;
        Double num2 = secondNumber;
        Double Mod = num1 % num2;
        System.out.println("The Mod is\t" + Mod);
    }
    //Third Method
    public Double ThirdModDoubleTypeNumberUsingMethod() {
        Double num1 = 819D;
        Double num2 = 542D;
        Double Mod = num1 % num2;
        return Mod;
    }
    //Forth Method
    public Double ForthModDoubleTypeNumberUsingMethod(Double firstNumber,Double secondNumber) {
        Double num1 = firstNumber;
        Double num2 = secondNumber;
        Double Mod = num1 % num2;
        return Mod;
    }
}
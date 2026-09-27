package shauryax.method.mod;

public class ModdoubleTwoNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        ModdoubleTwoNumberUsingMethod ModDoubleTypeNumber = new ModdoubleTwoNumberUsingMethod();
        //Method Call
        ModDoubleTypeNumber.FirstModDoubleTypeNumberUsingMethod();    //First Method
        //Method Call
        ModDoubleTypeNumber.SecondModDoubleTypeNumberUsingMethod(54d, 65d);    //First Method
        //Store Method in Variable & Method Call
        double third = ModDoubleTypeNumber.ThirdModDoubleTypeNumberUsingMethod();   //Third Method
        System.out.println("The Mod is\t" + third);
        //Store Method in Variable & Method Call
        double forth = ModDoubleTypeNumber.ForthModDoubleTypeNumberUsingMethod(83d, 73d);   //Forth Method
        System.out.println("The Mod is\t" + forth);
    }
    //First Method
    public void FirstModDoubleTypeNumberUsingMethod() {
        double num1 = 873d;
        double num2 = 763d;
        double Mod = num1 % num2;
        System.out.println("The Mod is\t" + Mod);
    }
    //Second Method
    public void SecondModDoubleTypeNumberUsingMethod(double firstNumber,double secondNumber) {
        double num1 = firstNumber;
        double num2 = secondNumber;
        double Mod = num1 % num2;
        System.out.println("The Mod is\t" + Mod);
    }
    //Third Method
    public double ThirdModDoubleTypeNumberUsingMethod() {
        double num1 = 819d;
        double num2 = 542d;
        double Mod = num1 % num2;
        return Mod;
    }
    //Forth Method
    public double ForthModDoubleTypeNumberUsingMethod(double firstNumber,double secondNumber) {
        double num1 = firstNumber;
        double num2 = secondNumber;
        double Mod = num1 % num2;
        return Mod;
    }
}
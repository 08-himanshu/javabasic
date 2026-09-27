package shauryax.method.mod;

public class ModFloatNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        ModFloatNumberUsingMethod ModFloatTypeNumber = new ModFloatNumberUsingMethod();
        //Method Call
        ModFloatTypeNumber.FirstModFloatTypeNumberUsingMethod();    //First Method
        //Method Call
        ModFloatTypeNumber.SecondModFloatTypeNumberUsingMethod(54F, 65F);    //First Method
        //Store Method in Variable & Method Call
        Float third = ModFloatTypeNumber.ThirdModFloatTypeNumberUsingMethod();   //Third Method
        System.out.println("The Mod is\t" + third);
        //Store Method in Variable & Method Call
        Float forth = ModFloatTypeNumber.ForthModFloatTypeNumberUsingMethod(83F, 73F);   //Forth Method
        System.out.println("The Mod is\t" + forth);
    }
    //First Method
    public void FirstModFloatTypeNumberUsingMethod() {
        Float num1 = 873F;
        Float num2 = 763F;
        Float Mod = num1 % num2;
        System.out.println("The Mod is\t" + Mod);
    }
    //Second Method
    public void SecondModFloatTypeNumberUsingMethod(Float firstNumber,Float secondNumber) {
        Float num1 = firstNumber;
        Float num2 = secondNumber;
        Float Mod = num1 % num2;
        System.out.println("The Mod is\t" + Mod);
    }
    //Third Method
    public Float ThirdModFloatTypeNumberUsingMethod() {
        Float num1 = 819F;
        Float num2 = 542F;
        Float Mod = num1 % num2;
        return Mod;
    }
    //Forth Method
    public Float ForthModFloatTypeNumberUsingMethod(Float firstNumber,Float secondNumber) {
        Float num1 = firstNumber;
        Float num2 = secondNumber;
        Float Mod = num1 % num2;
        return Mod;
    }
}
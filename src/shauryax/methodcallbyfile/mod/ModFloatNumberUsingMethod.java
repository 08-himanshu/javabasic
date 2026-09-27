package shauryax.methodcallbyfile.mod;

public class ModFloatNumberUsingMethod {

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
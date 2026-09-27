package shauryax.method.mod;

public class ModfloatTwoNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        ModfloatTwoNumberUsingMethod ModFloatTypeNumber = new ModfloatTwoNumberUsingMethod();
        //Method Call
        ModFloatTypeNumber.FirstModFloatTypeNumberUsingMethod();    //First Method
        //Method Call
        ModFloatTypeNumber.SecondModFloatTypeNumberUsingMethod(54f, 65f);    //First Method
        //Store Method in Variable & Method Call
        float third = ModFloatTypeNumber.ThirdModFloatTypeNumberUsingMethod();   //Third Method
        System.out.println("The Mod is\t" + third);
        //Store Method in Variable & Method Call
        float forth = ModFloatTypeNumber.ForthModFloatTypeNumberUsingMethod(83f, 73f);   //Forth Method
        System.out.println("The Mod is\t" + forth);
    }
    //First Method
    public void FirstModFloatTypeNumberUsingMethod() {
        float num1 = 873f;
        float num2 = 763f;
        float Mod = num1 % num2;
        System.out.println("The Mod is\t" + Mod);
    }
    //Second Method
    public void SecondModFloatTypeNumberUsingMethod(float firstNumber,float secondNumber) {
        float num1 = firstNumber;
        float num2 = secondNumber;
        float Mod = num1 % num2;
        System.out.println("The Mod is\t" + Mod);
    }
    //Third Method
    public float ThirdModFloatTypeNumberUsingMethod() {
        float num1 = 819f;
        float num2 = 542f;
        float Mod = num1 % num2;
        return Mod;
    }
    //Forth Method
    public float ForthModFloatTypeNumberUsingMethod(float firstNumber,float secondNumber) {
        float num1 = firstNumber;
        float num2 = secondNumber;
        float Mod = num1 % num2;
        return Mod;
    }
}
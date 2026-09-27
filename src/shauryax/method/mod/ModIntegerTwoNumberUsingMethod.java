package shauryax.method.mod;


public class ModIntegerTwoNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        ModIntegerTwoNumberUsingMethod ModIntegerTypeNumber = new ModIntegerTwoNumberUsingMethod();
        //Method Call
        ModIntegerTypeNumber.FirstModIntegerTypeNumberUsingMethod();    //First Method
        //Method Call
        ModIntegerTypeNumber.SecondModIntegerTypeNumberUsingMethod(54, 65);    //First Method
        //Store Method in Variable & Method Call
        Integer third = ModIntegerTypeNumber.ThirdModIntegerTypeNumberUsingMethod();   //Third Method
        System.out.println("The Mod is\t" + third);
        //Store Method in Variable & Method Call
        Integer forth = ModIntegerTypeNumber.ForthModIntegerTypeNumberUsingMethod(83, 73);   //Forth Method
        System.out.println("The Mod is\t" + forth);
    }
    //First Method
    public void FirstModIntegerTypeNumberUsingMethod() {
        Integer num1 = 873;
        Integer num2 = 763;
        Integer Mod = num1 % num2;
        System.out.println("The Mod is\t" + Mod);
    }
    //Second Method
    public void SecondModIntegerTypeNumberUsingMethod(Integer firstNumber,Integer secondNumber) {
        Integer num1 = firstNumber;
        Integer num2 = secondNumber;
        Integer Mod = num1 % num2;
        System.out.println("The Mod is\t" + Mod);
    }
    //Third Method
    public Integer ThirdModIntegerTypeNumberUsingMethod() {
        Integer num1 = 819;
        Integer num2 = 542;
        Integer Mod = num1 % num2;
        return Mod;
    }
    //Forth Method
    public Integer ForthModIntegerTypeNumberUsingMethod(Integer firstNumber,Integer secondNumber) {
        Integer num1 = firstNumber;
        Integer num2 = secondNumber;
        Integer Mod = num1 % num2;
        return Mod;
    }
}
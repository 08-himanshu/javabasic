package shauryax.methodcallbyfile.mod;

public class ModIntegerTwoNumberUsingMethod {

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
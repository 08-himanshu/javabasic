package shauryax.methodcallbyfile.mod;

public class ModLongNumberUsingMethod {

    //First Method
    public void FirstModLongTypeNumberUsingMethod() {
        Long num1 = 873L;
        Long num2 = 763L;
        Long Mod = num1 % num2;
        System.out.println("The Mod is\t" + Mod);
    }
    //Second Method
    public void SecondModLongTypeNumberUsingMethod(Long firstNumber,Long secondNumber) {
        Long num1 = firstNumber;
        Long num2 = secondNumber;
        Long Mod = num1 % num2;
        System.out.println("The Mod is\t" + Mod);
    }
    //Third Method
    public Long ThirdModLongTypeNumberUsingMethod() {
        Long num1 = 819L;
        Long num2 = 542L;
        Long Mod = num1 % num2;
        return Mod;
    }
    //Forth Method
    public Long ForthModLongTypeNumberUsingMethod(Long firstNumber,Long secondNumber) {
        Long num1 = firstNumber;
        Long num2 = secondNumber;
        Long Mod = num1 % num2;
        return Mod;
    }
}

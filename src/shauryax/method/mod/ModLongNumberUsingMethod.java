package shauryax.method.mod;

public class ModLongNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        ModLongNumberUsingMethod ModLongTypeNumber = new ModLongNumberUsingMethod();
        //Method Call
        ModLongTypeNumber.FirstModLongTypeNumberUsingMethod();    //First Method
        //Method Call
        ModLongTypeNumber.SecondModLongTypeNumberUsingMethod(54L, 65L);    //First Method
        //Store Method in Variable & Method Call
        Long third = ModLongTypeNumber.ThirdModLongTypeNumberUsingMethod();   //Third Method
        System.out.println("The Mod is\t" + third);
        //Store Method in Variable & Method Call
        Long forth = ModLongTypeNumber.ForthModLongTypeNumberUsingMethod(83L, 73L);   //Forth Method
        System.out.println("The Mod is\t" + forth);
    }
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

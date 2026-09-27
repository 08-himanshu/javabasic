package shauryax.method.mod;

public class ModlongTwoNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        ModlongTwoNumberUsingMethod ModLongTypeNumber = new ModlongTwoNumberUsingMethod();
        //Method Call
        ModLongTypeNumber.FirstModLongTypeNumberUsingMethod();    //First Method
        //Method Call
        ModLongTypeNumber.SecondModLongTypeNumberUsingMethod(54L, 65L);    //First Method
        //Store Method in Variable & Method Call
        long third = ModLongTypeNumber.ThirdModLongTypeNumberUsingMethod();   //Third Method
        System.out.println("The Mod is\t" + third);
        //Store Method in Variable & Method Call
        long forth = ModLongTypeNumber.ForthModLongTypeNumberUsingMethod(83L, 73L);   //Forth Method
        System.out.println("The Mod is\t" + forth);
    }
    //First Method
    public void FirstModLongTypeNumberUsingMethod() {
        long num1 = 873L;
        long num2 = 763L;
        long Mod = num1 % num2;
        System.out.println("The Mod is\t" + Mod);
    }
    //Second Method
    public void SecondModLongTypeNumberUsingMethod(long firstNumber,long secondNumber) {
        long num1 = firstNumber;
        long num2 = secondNumber;
        long Mod = num1 % num2;
        System.out.println("The Mod is\t" + Mod);
    }
    //Third Method
    public long ThirdModLongTypeNumberUsingMethod() {
        long num1 = 819L;
        long num2 = 542L;
        long Mod = num1 % num2;
        return Mod;
    }
    //Forth Method
    public long ForthModLongTypeNumberUsingMethod(long firstNumber,long secondNumber) {
        long num1 = firstNumber;
        long num2 = secondNumber;
        long Mod = num1 % num2;
        return Mod;
    }
}

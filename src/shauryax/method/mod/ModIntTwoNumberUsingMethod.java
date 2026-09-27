package shauryax.method.mod;

public class ModIntTwoNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        ModIntTwoNumberUsingMethod ModIntTypeNumber = new ModIntTwoNumberUsingMethod();
        //Method Call
        ModIntTypeNumber.FirstModIntTypeNumberUsingMethod();    //First Method
        //Method Call
        ModIntTypeNumber.SecondModIntTypeNumberUsingMethod(54, 65);    //First Method
        //Store Method in Variable & Method Call
        int third = ModIntTypeNumber.ThirdModIntTypeNumberUsingMethod();   //Third Method
        System.out.println("The Mod is\t" + third);
        //Store Method in Variable & Method Call
        int forth = ModIntTypeNumber.ForthModIntTypeNumberUsingMethod(83, 73);   //Forth Method
        System.out.println("The Mod is\t" + forth);
    }
    //First Method
    public void FirstModIntTypeNumberUsingMethod() {
        int num1 = 873;
        int num2 = 763;
        int Mod = num1 % num2;
        System.out.println("The Mod is\t" + Mod);
    }
    //Second Method
    public void SecondModIntTypeNumberUsingMethod(int firstNumber,int secondNumber) {
        int num1 = firstNumber;
        int num2 = secondNumber;
        int Mod = num1 % num2;
        System.out.println("The Mod is\t" + Mod);
    }
    //Third Method
    public int ThirdModIntTypeNumberUsingMethod() {
        int num1 = 819;
        int num2 = 542;
        int Mod = num1 % num2;
        return Mod;
    }
    //Forth Method
    public int ForthModIntTypeNumberUsingMethod(int firstNumber,int secondNumber) {
        int num1 = firstNumber;
        int num2 = secondNumber;
        int Mod = num1 % num2;
        return Mod;
    }
}

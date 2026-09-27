package shauryax.methodcallbyfile.mod;

public class CallModIntegerTwoNumberUsingMethod {
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
}

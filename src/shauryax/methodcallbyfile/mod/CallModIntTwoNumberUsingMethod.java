package shauryax.methodcallbyfile.mod;

public class CallModIntTwoNumberUsingMethod {
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
}

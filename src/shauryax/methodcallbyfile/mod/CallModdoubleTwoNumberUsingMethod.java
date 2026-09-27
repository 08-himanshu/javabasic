package shauryax.methodcallbyfile.mod;

public class CallModdoubleTwoNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        ModdoubleTwoNumberUsingMethod ModDoubleTypeNumber = new ModdoubleTwoNumberUsingMethod();
        //Method Call
        ModDoubleTypeNumber.FirstModDoubleTypeNumberUsingMethod();    //First Method
        //Method Call
        ModDoubleTypeNumber.SecondModDoubleTypeNumberUsingMethod(54d, 65d);    //First Method
        //Store Method in Variable & Method Call
        double third = ModDoubleTypeNumber.ThirdModDoubleTypeNumberUsingMethod();   //Third Method
        System.out.println("The Mod is\t" + third);
        //Store Method in Variable & Method Call
        double forth = ModDoubleTypeNumber.ForthModDoubleTypeNumberUsingMethod(83d, 73d);   //Forth Method
        System.out.println("The Mod is\t" + forth);
    }
}

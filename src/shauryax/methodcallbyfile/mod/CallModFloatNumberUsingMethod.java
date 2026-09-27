package shauryax.methodcallbyfile.mod;

public class CallModFloatNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        ModFloatNumberUsingMethod ModFloatTypeNumber = new ModFloatNumberUsingMethod();
        //Method Call
        ModFloatTypeNumber.FirstModFloatTypeNumberUsingMethod();    //First Method
        //Method Call
        ModFloatTypeNumber.SecondModFloatTypeNumberUsingMethod(54F, 65F);    //First Method
        //Store Method in Variable & Method Call
        Float third = ModFloatTypeNumber.ThirdModFloatTypeNumberUsingMethod();   //Third Method
        System.out.println("The Mod is\t" + third);
        //Store Method in Variable & Method Call
        Float forth = ModFloatTypeNumber.ForthModFloatTypeNumberUsingMethod(83F, 73F);   //Forth Method
        System.out.println("The Mod is\t" + forth);
    }
}

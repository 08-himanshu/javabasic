package shauryax.methodcallbyfile.mod;

public class CallModfloatTwoNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        ModfloatTwoNumberUsingMethod ModFloatTypeNumber = new ModfloatTwoNumberUsingMethod();
        //Method Call
        ModFloatTypeNumber.FirstModFloatTypeNumberUsingMethod();    //First Method
        //Method Call
        ModFloatTypeNumber.SecondModFloatTypeNumberUsingMethod(54f, 65f);    //First Method
        //Store Method in Variable & Method Call
        float third = ModFloatTypeNumber.ThirdModFloatTypeNumberUsingMethod();   //Third Method
        System.out.println("The Mod is\t" + third);
        //Store Method in Variable & Method Call
        float forth = ModFloatTypeNumber.ForthModFloatTypeNumberUsingMethod(83f, 73f);   //Forth Method
        System.out.println("The Mod is\t" + forth);
    }
}

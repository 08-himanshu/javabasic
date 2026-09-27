package shauryax.methodcallbyfile.mod;

public class CallModLongNumberUsingMethod {
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
}

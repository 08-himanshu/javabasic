package shauryax.methodcallbyfile.mod;

public class CallModDoubleNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        ModDoubleNumberUsingMethod ModDoubleTypeNumber = new ModDoubleNumberUsingMethod();
        //Method Call
        ModDoubleTypeNumber.FirstModDoubleTypeNumberUsingMethod();    //First Method
        //Method Call
        ModDoubleTypeNumber.SecondModDoubleTypeNumberUsingMethod(54D, 65D);    //First Method
        //Store Method in Variable & Method Call
        Double third = ModDoubleTypeNumber.ThirdModDoubleTypeNumberUsingMethod();   //Third Method
        System.out.println("The Mod is\t" + third);
        //Store Method in Variable & Method Call
        Double forth = ModDoubleTypeNumber.ForthModDoubleTypeNumberUsingMethod(83D, 73D);   //Forth Method
        System.out.println("The Mod is\t" + forth);
    }
}

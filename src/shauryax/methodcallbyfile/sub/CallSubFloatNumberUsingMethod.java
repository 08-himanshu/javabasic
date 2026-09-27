package shauryax.methodcallbyfile.sub;

public class CallSubFloatNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        SubFloatNumberUsingMethod SubFloatTypeNumber = new SubFloatNumberUsingMethod();
        //Method Call
        SubFloatTypeNumber.FirstSubFloatTypeNumberUsingMethod();    //First Method
        //Method Call
        SubFloatTypeNumber.SecondSubFloatTypeNumberUsingMethod(53F, 82F);    //Second Method
        //Store Method in Variable & Method Call
        Float third = SubFloatTypeNumber.ThirdSubFloatTypeNumberUsingMethod();   //Third Method
        System.out.println("The sub is\t" + third);
        //Store Method in Variable & Method Call
        Float forth = SubFloatTypeNumber.ForthSubFloatTypeNumberUsingMethod(83F, 98F);   //Forth Method
        System.out.println("The sub is\t" + forth);
    }


}

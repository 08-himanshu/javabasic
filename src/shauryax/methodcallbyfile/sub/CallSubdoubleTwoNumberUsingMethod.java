package shauryax.methodcallbyfile.sub;

public class CallSubdoubleTwoNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        SubdoubleTwoNumberUsingMethod SubDoubleTypeNumber = new SubdoubleTwoNumberUsingMethod();
        //Method Call
        SubDoubleTypeNumber.FirstSubDoubleTypeNumberUsingMethod();    //First Method
        //Method Call
        SubDoubleTypeNumber.SecondSubDoubleTypeNumberUsingMethod(53D, 82D);    //Second Method
        //Store Method in Variable & Method Call
        double third = SubDoubleTypeNumber.ThirdSubDoubleTypeNumberUsingMethod();   //Third Method
        System.out.println("The sub is\t" + third);
        //Store Method in Variable & Method Call
        double forth = SubDoubleTypeNumber.ForthSubDoubleTypeNumberUsingMethod(83D, 98D);   //Forth Method
        System.out.println("The sub is\t" + forth);
    }
}

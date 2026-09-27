package shauryax.methodcallbyfile.sub;

public class CallSublongTwoNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        SublongTwoNumberUsingMethod SubLongTypeNumber = new SublongTwoNumberUsingMethod();
        //Method Call
        SubLongTypeNumber.FirstSubLongTypeNumberUsingMethod();    //First Method
        //Method Call
        SubLongTypeNumber.SecondSubLongTypeNumberUsingMethod(53, 82);    //Second Method
        //Store Method in Variable & Method Call
        long third = SubLongTypeNumber.ThirdSubLongTypeNumberUsingMethod();   //Third Method
        System.out.println("The sub is\t" + third);
        //Store Method in Variable & Method Call
        long forth = SubLongTypeNumber.ForthSubLongTypeNumberUsingMethod(83, 98);   //Forth Method
        System.out.println("The sub is\t" + forth);
    }
}

package shauryax.methodcallbyfile.sub;

public class CallSubLongNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        SubLongNumberUsingMethod SubLongTypeNumber = new SubLongNumberUsingMethod();
        //Method Call
        SubLongTypeNumber.FirstSubLongTypeNumberUsingMethod();    //First Method
        //Method Call
        SubLongTypeNumber.SecondSubLongTypeNumberUsingMethod(53L, 82L);    //Second Method
        //Store Method in Variable & Method Call
        Long third = SubLongTypeNumber.ThirdSubLongTypeNumberUsingMethod();   //Third Method
        System.out.println("The sub is\t" + third);
        //Store Method in Variable & Method Call
        Long forth = SubLongTypeNumber.ForthSubLongTypeNumberUsingMethod(83L, 98L);   //Forth Method
        System.out.println("The sub is\t" + forth);
    }
}

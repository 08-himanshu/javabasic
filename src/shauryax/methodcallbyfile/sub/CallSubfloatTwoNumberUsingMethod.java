package shauryax.methodcallbyfile.sub;

public class CallSubfloatTwoNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        SubfloatTwoNumberUsingMethod SubDoubleTypeNumber = new SubfloatTwoNumberUsingMethod();
        //Method Call
        SubDoubleTypeNumber.FirstSubDoubleTypeNumberUsingMethod();    //First Method
        //Method Call
        SubDoubleTypeNumber.SecondSubDoubleTypeNumberUsingMethod(53f, 82f);    //Second Method
        //Store Method in Variable & Method Call
        float third = SubDoubleTypeNumber.ThirdSubDoubleTypeNumberUsingMethod();   //Third Method
        System.out.println("The sub is\t" + third);
        //Store Method in Variable & Method Call
        float forth = SubDoubleTypeNumber.ForthSubDoubleTypeNumberUsingMethod(83f, 98f);   //Forth Method
        System.out.println("The sub is\t" + forth);
    }
}

package shauryax.methodcallbyfile.sub;

public class CallSubIntegerTwoNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        SubIntegerTwoNumberUsingMethod SubIntegerTypeNumber = new SubIntegerTwoNumberUsingMethod();
        //Method Call
        SubIntegerTypeNumber.FirstSubIntegerTypeNumberUsingMethod();    //First Method
        //Method Call
        SubIntegerTypeNumber.SecondSubIntegerTypeNumberUsingMethod(53, 82);    //Second Method
        //Store Method in Variable & Method Call
        Integer third = SubIntegerTypeNumber.ThirdSubIntegerTypeNumberUsingMethod();   //Third Method
        System.out.println("The sub is\t" + third);
        //Store Method in Variable & Method Call
        Integer forth = SubIntegerTypeNumber.ForthSubIntegerTypeNumberUsingMethod(83, 98);   //Forth Method
        System.out.println("The sub is\t" + forth);
    }
}

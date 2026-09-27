package shauryax.methodcallbyfile.sub;

public class CallSubIntTwoNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        SubIntTwoNumberUsingMethod SubIntTypeNumber = new SubIntTwoNumberUsingMethod();
        //Method Call
        SubIntTypeNumber.FirstSubIntTypeNumberUsingMethod();    //First Method
        //Method Call
        SubIntTypeNumber.SecondSubIntTypeNumberUsingMethod(53, 82);    //Second Method
        //Store Method in Variable & Method Call
        int third = SubIntTypeNumber.ThirdSubIntTypeNumberUsingMethod();   //Third Method
        System.out.println("The sub is\t" + third);
        //Store Method in Variable & Method Call
        int forth = SubIntTypeNumber.ForthSubIntTypeNumberUsingMethod(83, 98);   //Forth Method
        System.out.println("The sub is\t" + forth);
    }
}

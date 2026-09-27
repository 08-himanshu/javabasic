package shauryax.methodcallbyfile.mul;

public class CallMulIntegerTwoNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        MulIntegerTwoNumberUsingMethod MulIntegerTypeNumber = new MulIntegerTwoNumberUsingMethod();
        //Method Call
        MulIntegerTypeNumber.FirstMulIntegerTypeNumberUsingMethod();    //First Method
        //Method Call
        MulIntegerTypeNumber.SecondMulIntegerTypeNumberUsingMethod(826, 736);    //Second Method
        //Store Method in Variable & Method Call
        Integer third = MulIntegerTypeNumber.ThirdMulIntegerTypeNumberUsingMethod();   //Third Method
        System.out.println("The Mul is\t" + third);
        //Store Method in Variable & Method Call
        Integer forth = MulIntegerTypeNumber.ForthMulIntegerTypeNumberUsingMethod(524, 435);   //Forth Method
        System.out.println("The Mul is\t" + forth);
    }
}

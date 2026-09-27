package shauryax.methodcallbyfile.mul;

public class CallMulfloatTwoNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        MulfloatTwoNumberUsingMethod MulFloatTypeNumber = new MulfloatTwoNumberUsingMethod();
        //Method Call
        MulFloatTypeNumber.FirstMulFloatTypeNumberUsingMethod();    //First Method
        //Method Call
        MulFloatTypeNumber.SecondMulFloatTypeNumberUsingMethod(826f, 736f);    //Second Method
        //Store Method in Variable & Method Call
        float third = MulFloatTypeNumber.ThirdMulFloatTypeNumberUsingMethod();   //Third Method
        System.out.println("The Mul is\t" + third);
        //Store Method in Variable & Method Call
        float forth = MulFloatTypeNumber.ForthMulFloatTypeNumberUsingMethod(524f, 435f);   //Forth Method
        System.out.println("The Mul is\t" + forth);
    }
}

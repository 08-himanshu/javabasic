package shauryax.methodcallbyfile.mul;

public class CallMulFloatNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        MulFloatNumberUsingMethod MulFloatTypeNumber = new MulFloatNumberUsingMethod();
        //Method Call
        MulFloatTypeNumber.FirstMulFloatTypeNumberUsingMethod();    //First Method
        //Method Call
        MulFloatTypeNumber.SecondMulFloatTypeNumberUsingMethod(826F, 736F);    //Second Method
        //Store Method in Variable & Method Call
        Float third = MulFloatTypeNumber.ThirdMulFloatTypeNumberUsingMethod();   //Third Method
        System.out.println("The Mul is\t" + third);
        //Store Method in Variable & Method Call
        Float forth = MulFloatTypeNumber.ForthMulFloatTypeNumberUsingMethod(524F, 435F);   //Forth Method
        System.out.println("The Mul is\t" + forth);
    }
}

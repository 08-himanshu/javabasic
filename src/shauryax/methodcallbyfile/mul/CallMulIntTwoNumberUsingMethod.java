package shauryax.methodcallbyfile.mul;

public class CallMulIntTwoNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        MulIntTwoNumberUsingMethod MulIntTypeNumber = new MulIntTwoNumberUsingMethod();
        //Method Call
        MulIntTypeNumber.FirstMulIntTypeNumberUsingMethod();    //First Method
        //Method Call
        MulIntTypeNumber.SecondMulIntTypeNumberUsingMethod(826, 736);    //Second Method
        //Store Method in Variable & Method Call
        int third = MulIntTypeNumber.ThirdMulIntTypeNumberUsingMethod();   //Third Method
        System.out.println("The Mul is\t" + third);
        //Store Method in Variable & Method Call
        int forth = MulIntTypeNumber.ForthMulIntTypeNumberUsingMethod(524, 435);   //Forth Method
        System.out.println("The Mul is\t" + forth);
    }
}

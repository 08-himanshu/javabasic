package shauryax.methodcallbyfile.mul;

public class CallMulDoubleNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        MulDoubleNumberUsingMethod MulDoubleTypeNumber = new MulDoubleNumberUsingMethod();
        //Method Call
        MulDoubleTypeNumber.FirstMulDoubleTypeNumberUsingMethod();    //First Method
        //Method Call
        MulDoubleTypeNumber.SecondMulDoubleTypeNumberUsingMethod(826D, 736D);    //Second Method
        //Store Method in Variable & Method Call
        Double third = MulDoubleTypeNumber.ThirdMulDoubleTypeNumberUsingMethod();   //Third Method
        System.out.println("The Mul is\t" + third);
        //Store Method in Variable & Method Call
        Double forth = MulDoubleTypeNumber.ForthMulDoubleTypeNumberUsingMethod(524D, 435D);   //Forth Method
        System.out.println("The Mul is\t" + forth);
    }
}

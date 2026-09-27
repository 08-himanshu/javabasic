package shauryax.methodcallbyfile.mul;

public class CallMulLongNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        MulLongNumberUsingMethod MulLongTypeNumber = new MulLongNumberUsingMethod();
        //Method Call
        MulLongTypeNumber.FirstMulLongTypeNumberUsingMethod();    //First Method
        //Method Call
        MulLongTypeNumber.SecondMulLongTypeNumberUsingMethod(826L, 736L);    //Second Method
        //Store Method in Variable & Method Call
        Long third = MulLongTypeNumber.ThirdMulLongTypeNumberUsingMethod();   //Third Method
        System.out.println("The Mul is\t" + third);
        //Store Method in Variable & Method Call
        Long forth = MulLongTypeNumber.ForthMulLongTypeNumberUsingMethod(524L, 435L);   //Forth Method
        System.out.println("The Mul is\t" + forth);
    }
}

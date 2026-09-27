package shauryax.methodcallbyfile.mul;

public class CallMuldoubleTwoNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        MuldoubleTwoNumberUsingMethod MulDoubleTypeNumber = new MuldoubleTwoNumberUsingMethod();
        //Method Call
        MulDoubleTypeNumber.FirstMulDoubleTypeNumberUsingMethod();    //First Method
        //Method Call
        MulDoubleTypeNumber.SecondMulDoubleTypeNumberUsingMethod(826d, 736d);    //Second Method
        //Store Method in Variable & Method Call
        double third = MulDoubleTypeNumber.ThirdMulDoubleTypeNumberUsingMethod();   //Third Method
        System.out.println("The Mul is\t" + third);
        //Store Method in Variable & Method Call
        double forth = MulDoubleTypeNumber.ForthMulDoubleTypeNumberUsingMethod(524d, 435d);   //Forth Method
        System.out.println("The Mul is\t" + forth);
    }
}

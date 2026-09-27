package shauryax.method.mul;

public class MulFloatNumberUsingMethod {
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
    //First Method
    public void FirstMulFloatTypeNumberUsingMethod() {
        Float num1 = 76F;
        Float num2 = 83F;
        Float mul = num1 * num2;
        System.out.println("The Mul is\t" + mul);
    }
    //Second Method
    public void SecondMulFloatTypeNumberUsingMethod(Float firstNumber,Float secondNumber) {
        Float num1 = firstNumber;
        Float num2 = secondNumber;
        Float mul = num1 * num2;
        System.out.println("The Mul is\t" + mul);
    }
    //Third Method
    public Float ThirdMulFloatTypeNumberUsingMethod() {
        Float num1 = 92F;
        Float num2 = 63F;
        Float mul = num1 * num2;
        return mul;
    }
    //Forth Method
    public Float ForthMulFloatTypeNumberUsingMethod(Float firstNumber,Float secondNumber) {
        Float num1 = firstNumber;
        Float num2 = secondNumber;
        Float mul = num1 * num2;
        return mul;
    }
}
package shauryax.method.mul;

public class MuldoubleTwoNumberUsingMethod {
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
    //First Method
    public void FirstMulDoubleTypeNumberUsingMethod() {
        double num1 = 76d;
        double num2 = 83d;
        double mul = num1 * num2;
        System.out.println("The Mul is\t" + mul);
    }
    //Second Method
    public void SecondMulDoubleTypeNumberUsingMethod(double firstNumber,double secondNumber) {
        double num1 = firstNumber;
        double num2 = secondNumber;
        double mul = num1 * num2;
        System.out.println("The Mul is\t" + mul);
    }
    //Third Method
    public double ThirdMulDoubleTypeNumberUsingMethod() {
        double num1 = 92d;
        double num2 = 63d;
        double mul = num1 * num2;
        return mul;
    }
    //Forth Method
    public double ForthMulDoubleTypeNumberUsingMethod(double firstNumber,double secondNumber) {
        double num1 = firstNumber;
        double num2 = secondNumber;
        double mul = num1 * num2;
        return mul;
    }
}
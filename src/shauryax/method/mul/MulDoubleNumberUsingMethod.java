package shauryax.method.mul;

public class MulDoubleNumberUsingMethod {
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
    //First Method
    public void FirstMulDoubleTypeNumberUsingMethod() {
        Double num1 = 76D;
        Double num2 = 83D;
        Double mul = num1 * num2;
        System.out.println("The Mul is\t" + mul);
    }
    //Second Method
    public void SecondMulDoubleTypeNumberUsingMethod(Double firstNumber,Double secondNumber) {
        Double num1 = firstNumber;
        Double num2 = secondNumber;
        Double mul = num1 * num2;
        System.out.println("The Mul is\t" + mul);
    }
    //Third Method
    public Double ThirdMulDoubleTypeNumberUsingMethod() {
        Double num1 = 92D;
        Double num2 = 63D;
        Double mul = num1 * num2;
        return mul;
    }
    //Forth Method
    public Double ForthMulDoubleTypeNumberUsingMethod(Double firstNumber,Double secondNumber) {
        Double num1 = firstNumber;
        Double num2 = secondNumber;
        Double mul = num1 * num2;
        return mul;
    }
}
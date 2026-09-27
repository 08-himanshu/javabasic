package shauryax.method.mul;

public class MulIntegerTwoNumberUsingMethod {
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
    //First Method
    public void FirstMulIntegerTypeNumberUsingMethod() {
        Integer num1 = 76;
        Integer num2 = 83;
        Integer mul = num1 * num2;
        System.out.println("The Mul is\t" + mul);
    }
    //Second Method
    public void SecondMulIntegerTypeNumberUsingMethod(Integer firstNumber,Integer secondNumber) {
        Integer num1 = firstNumber;
        Integer num2 = secondNumber;
        Integer mul = num1 * num2;
        System.out.println("The Mul is\t" + mul);
    }
    //Third Method
    public Integer ThirdMulIntegerTypeNumberUsingMethod() {
        Integer num1 = 92;
        Integer num2 = 63;
        Integer mul = num1 * num2;
        return mul;
    }
    //Forth Method
    public Integer ForthMulIntegerTypeNumberUsingMethod(Integer firstNumber,Integer secondNumber) {
        Integer num1 = firstNumber;
        Integer num2 = secondNumber;
        Integer mul = num1 * num2;
        return mul;
    }
}
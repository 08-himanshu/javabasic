package shauryax.method.mul;

public class MulLongNumberUsingMethod {
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
    //First Method
    public void FirstMulLongTypeNumberUsingMethod() {
        Long num1 = 76L;
        Long num2 = 83L;
        Long mul = num1 * num2;
        System.out.println("The Mul is\t" + mul);
    }
    //Second Method
    public void SecondMulLongTypeNumberUsingMethod(Long firstNumber,Long secondNumber) {
        Long num1 = firstNumber;
        Long num2 = secondNumber;
        Long mul = num1 * num2;
        System.out.println("The Mul is\t" + mul);
    }
    //Third Method
    public Long ThirdMulLongTypeNumberUsingMethod() {
        Long num1 = 92L;
        Long num2 = 63L;
        Long mul = num1 * num2;
        return mul;
    }
    //Forth Method
    public Long ForthMulLongTypeNumberUsingMethod(Long firstNumber,Long secondNumber) {
        Long num1 = firstNumber;
        Long num2 = secondNumber;
        Long mul = num1 * num2;
        return mul;
    }
}

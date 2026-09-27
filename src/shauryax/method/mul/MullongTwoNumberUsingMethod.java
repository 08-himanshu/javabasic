package shauryax.method.mul;

public class MullongTwoNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        MullongTwoNumberUsingMethod MulLongTypeNumber = new MullongTwoNumberUsingMethod();
        //Method Call
        MulLongTypeNumber.FirstMulLongTypeNumberUsingMethod();    //First Method
        //Method Call
        MulLongTypeNumber.SecondMulLongTypeNumberUsingMethod(826L, 736L);    //Second Method
        //Store Method in Variable & Method Call
        long third = MulLongTypeNumber.ThirdMulLongTypeNumberUsingMethod();   //Third Method
        System.out.println("The Mul is\t" + third);
        //Store Method in Variable & Method Call
        long forth = MulLongTypeNumber.ForthMulLongTypeNumberUsingMethod(524L, 435L);   //Forth Method
        System.out.println("The Mul is\t" + forth);
    }
    //First Method
    public void FirstMulLongTypeNumberUsingMethod() {
        long num1 = 76L;
        long num2 = 83L;
        long mul = num1 * num2;
        System.out.println("The Mul is\t" + mul);
    }
    //Second Method
    public void SecondMulLongTypeNumberUsingMethod(long firstNumber,long secondNumber) {
        long num1 = firstNumber;
        long num2 = secondNumber;
        long mul = num1 * num2;
        System.out.println("The Mul is\t" + mul);
    }
    //Third Method
    public long ThirdMulLongTypeNumberUsingMethod() {
        long num1 = 92L;
        long num2 = 69L;
        long mul = num1 * num2;
        return mul;
    }
    //Forth Method
    public long ForthMulLongTypeNumberUsingMethod(long firstNumber,long secondNumber) {
        long num1 = firstNumber;
        long num2 = secondNumber;
        long mul = num1 * num2;
        return mul;
    }
}

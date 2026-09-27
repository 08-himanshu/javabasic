package shauryax.method.mul;

public class MulfloatTwoNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        MulfloatTwoNumberUsingMethod MulFloatTypeNumber = new MulfloatTwoNumberUsingMethod();
        //Method Call
        MulFloatTypeNumber.FirstMulFloatTypeNumberUsingMethod();    //First Method
        //Method Call
        MulFloatTypeNumber.SecondMulFloatTypeNumberUsingMethod(826f, 736f);    //Second Method
        //Store Method in Variable & Method Call
        float third = MulFloatTypeNumber.ThirdMulFloatTypeNumberUsingMethod();   //Third Method
        System.out.println("The Mul is\t" + third);
        //Store Method in Variable & Method Call
        float forth = MulFloatTypeNumber.ForthMulFloatTypeNumberUsingMethod(524f, 435f);   //Forth Method
        System.out.println("The Mul is\t" + forth);
    }
    //First Method
    public void FirstMulFloatTypeNumberUsingMethod() {
        float num1 = 76f;
        float num2 = 83f;
        float mul = num1 * num2;
        System.out.println("The Mul is\t" + mul);
    }
    //Second Method
    public void SecondMulFloatTypeNumberUsingMethod(float firstNumber,float secondNumber) {
        float num1 = firstNumber;
        float num2 = secondNumber;
        float mul = num1 * num2;
        System.out.println("The Mul is\t" + mul);
    }
    //Third Method
    public float ThirdMulFloatTypeNumberUsingMethod() {
        float num1 = 92f;
        float num2 = 63f;
        float mul = num1 * num2;
        return mul;
    }
    //Forth Method
    public float ForthMulFloatTypeNumberUsingMethod(float firstNumber,float secondNumber) {
        float num1 = firstNumber;
        float num2 = secondNumber;
        float mul = num1 * num2;
        return mul;
    }
}
package shauryax.method.mul;

public class MulIntTwoNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        MulIntTwoNumberUsingMethod MulIntTypeNumber = new MulIntTwoNumberUsingMethod();
        //Method Call
        MulIntTypeNumber.FirstMulIntTypeNumberUsingMethod();    //First Method
        //Method Call
        MulIntTypeNumber.SecondMulIntTypeNumberUsingMethod(826, 736);    //Second Method
        //Store Method in Variable & Method Call
        int third = MulIntTypeNumber.ThirdMulIntTypeNumberUsingMethod();   //Third Method
        System.out.println("The Mul is\t" + third);
        //Store Method in Variable & Method Call
        int forth = MulIntTypeNumber.ForthMulIntTypeNumberUsingMethod(524, 435);   //Forth Method
        System.out.println("The Mul is\t" + forth);
    }
    //First Method
    public void FirstMulIntTypeNumberUsingMethod() {
        int num1 = 76;
        int num2 = 83;
        int mul = num1 * num2;
        System.out.println("The Mul is\t" + mul);
    }
    //Second Method
    public void SecondMulIntTypeNumberUsingMethod(int firstNumber,int secondNumber) {
        int num1 = firstNumber;
        int num2 = secondNumber;
        int mul = num1 * num2;
        System.out.println("The Mul is\t" + mul);
    }
    //Third Method
    public int ThirdMulIntTypeNumberUsingMethod() {
        int num1 = 92;
        int num2 = 63;
        int mul = num1 * num2;
        return mul;
    }
    //Forth Method
    public int ForthMulIntTypeNumberUsingMethod(int firstNumber,int secondNumber) {
        int num1 = firstNumber;
        int num2 = secondNumber;
        int mul = num1 * num2;
        return mul;
    }
}

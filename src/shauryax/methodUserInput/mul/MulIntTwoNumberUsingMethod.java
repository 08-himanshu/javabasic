package shauryax.methodUserInput.mul;

import java.util.Scanner;

public class MulIntTwoNumberUsingMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter you First Digit\t");
        int firstNumber = scan.nextInt();
        System.out.print("Enter your Second Digit\t");
        int secondNumber = scan.nextInt();
        //Create Object
        MulIntTwoNumberUsingMethod MulIntTwoNumber = new MulIntTwoNumberUsingMethod();
        //Method Call
        MulIntTwoNumber.FirstMulIntNumberUsingMethod(firstNumber, secondNumber);    //First Method
        //Store Method in Variable & Method Call
        int mul = MulIntTwoNumber.SecondMulIntNumberUsingMethod(firstNumber,secondNumber);  //Second Method
        System.out.println("Mul of Digits =\t"+ mul);
    }
    //First Method
    public void FirstMulIntNumberUsingMethod(int firstNumber, int secondNumber) {
        int num1 = firstNumber;
        int num2 = secondNumber;
        int mul = firstNumber * secondNumber;
        System.out.println("Mul of Digits =\t"+ mul);
    }
    //Second Method
    public int SecondMulIntNumberUsingMethod(int firstNumber, int secondNumber) {
        int num1 = firstNumber;
        int num2 = secondNumber;
        int mul = firstNumber * secondNumber;
        return mul;
    }
}

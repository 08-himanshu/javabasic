package shauryax.methodUserInput.mul;

import java.util.Scanner;

public class MuldoubleTwoNumberUsingMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your First Integer Parameter\t");
        double firstNumber = scan.nextInt();
        System.out.print("Enter Your Second Integer Parameter\t");
        double secondNumber = scan.nextInt();
        //Create Object
        MuldoubleTwoNumberUsingMethod MulDoubleTypeNumber = new MuldoubleTwoNumberUsingMethod();
        //Method Call
        MulDoubleTypeNumber.FirstMulDoubleTypeNumberUsingMethod(firstNumber, secondNumber);    //First Method
        //Store Method in Variable & Method Call
        double mul = MulDoubleTypeNumber.SecondMulDoubleTypeNumberUsingMethod(firstNumber, secondNumber);   //Second Method
        System.out.println("The Mul is\t" + mul);
    }
    //First Method
    public void FirstMulDoubleTypeNumberUsingMethod(double firstNumber,double secondNumber) {
        double num1 = firstNumber;
        double num2 = secondNumber;
        double mul = num1 * num2;
        System.out.println("The Mul is\t" + mul);
    }
    //First Method
    public double SecondMulDoubleTypeNumberUsingMethod(double firstNumber,double secondNumber) {
        double num1 = firstNumber;
        double num2 = secondNumber;
        double mul = num1 * num2;
        return mul;
    }
}
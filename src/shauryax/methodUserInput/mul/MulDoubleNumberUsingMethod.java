package shauryax.methodUserInput.mul;

import java.util.Scanner;

public class MulDoubleNumberUsingMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your First Integer Parameter\t");
        Double firstNumber = scan.nextDouble();
        System.out.print("Enter Your Second Integer Parameter\t");
        Double secondNumber = scan.nextDouble();
        //Create Object
        MulDoubleNumberUsingMethod MulDoubleTypeNumber = new MulDoubleNumberUsingMethod();
        //Method Call
        MulDoubleTypeNumber.FirstMulDoubleTypeNumberUsingMethod(firstNumber, secondNumber);    //First Method
        //Store Method in Variable & Method Call
        Double mul = MulDoubleTypeNumber.SecondMulDoubleTypeNumberUsingMethod(firstNumber, secondNumber);   //Second Method
        System.out.println("The Mul is\t" + mul);
    }
    //First Method
    public void FirstMulDoubleTypeNumberUsingMethod(Double firstNumber,Double secondNumber) {
        Double num1 = firstNumber;
        Double num2 = secondNumber;
        Double mul = num1 * num2;
        System.out.println("The Mul is\t" + mul);
    }
    //Second Method
    public Double SecondMulDoubleTypeNumberUsingMethod(Double firstNumber,Double secondNumber) {
        Double num1 = firstNumber;
        Double num2 = secondNumber;
        Double mul = num1 * num2;
        return mul;
    }
}
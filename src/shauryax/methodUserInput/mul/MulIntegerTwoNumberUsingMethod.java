package shauryax.methodUserInput.mul;

import java.util.Scanner;

public class MulIntegerTwoNumberUsingMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter you First Digit\t");
        Integer firstNumber = scan.nextInt();
        System.out.print("Enter your Second Digit\t");
        Integer secondNumber = scan.nextInt();
        //Create Object
        MulIntegerTwoNumberUsingMethod MulIntegerTwoNumber = new MulIntegerTwoNumberUsingMethod();
        //Method Call
        MulIntegerTwoNumber.FirstMulIntegerNumberUsingMethod(firstNumber, secondNumber);    //First Method
        //Store Method in Variable & Method Call
        Integer mul = MulIntegerTwoNumber.SecondMulIntNumberUsingMethod(firstNumber, secondNumber); //Second Method
        System.out.println("Mul of Digits =\t"+ mul);
    }
    //First Method
    public void FirstMulIntegerNumberUsingMethod(Integer firstNumber, Integer secondNumber) {
        Integer num1 = firstNumber;
        Integer num2 = secondNumber;
        Integer mul = firstNumber * secondNumber;
        System.out.println("Mul of Digits =\t"+ mul);
    }
    //Second Method
    public Integer SecondMulIntNumberUsingMethod(Integer firstNumber, Integer secondNumber) {
        Integer num1 = firstNumber;
        Integer num2 = secondNumber;
        Integer mul = firstNumber * secondNumber;
        return mul;
    }
}
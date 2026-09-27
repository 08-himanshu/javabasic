package shauryax.methodUserInput.mul;

import java.util.Scanner;

public class MulLongNumberUsingMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter you First Digit\t");
        Long firstNumber = scan.nextLong();
        System.out.print("Enter your Second Digit\t");
        Long secondNumber = scan.nextLong();
        //Create Object
        MulLongNumberUsingMethod MulLongTwoNumber = new MulLongNumberUsingMethod();
        //Method Call
        MulLongTwoNumber.FirstMulLongNumberUsingMethod(firstNumber, secondNumber);    //First Method
        //Store Method in Variable & Method Call
        Long mul = MulLongTwoNumber.SecondMulLongNumberUsingMethod(firstNumber,secondNumber);  //Second Method
        System.out.println("Mul of Digits =\t"+ mul);
    }
    //First Method
    public void FirstMulLongNumberUsingMethod(Long firstNumber, Long secondNumber) {
        Long num1 = firstNumber;
        Long num2 = secondNumber;
        Long mul = firstNumber * secondNumber;
        System.out.println("Mul of Digits =\t"+ mul);
    }
    //Second Method
    public Long SecondMulLongNumberUsingMethod(Long firstNumber, Long secondNumber) {
        Long num1 = firstNumber;
        Long num2 = secondNumber;
        Long mul = firstNumber * secondNumber;
        return mul;
    }
}

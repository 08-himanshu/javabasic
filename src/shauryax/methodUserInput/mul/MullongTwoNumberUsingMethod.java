package shauryax.methodUserInput.mul;

import java.util.Scanner;

public class MullongTwoNumberUsingMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter you First Digit\t");
        long firstNumber = scan.nextLong();
        System.out.print("Enter your Second Digit\t");
        long secondNumber = scan.nextLong();
        //Create Object
        MullongTwoNumberUsingMethod MullongTwoNumber = new MullongTwoNumberUsingMethod();
        //Method Call
        MullongTwoNumber.FirstMulLongNumberUsingMethod(firstNumber, secondNumber);    //First Method
        //Store Method in Variable & Method Call
        long mul = MullongTwoNumber.SecondMulLongNumberUsingMethod(firstNumber,secondNumber);  //Second Method
        System.out.println("Mul of Digits =\t"+ mul);
    }
    //First Method
    public void FirstMulLongNumberUsingMethod(long firstNumber, long secondNumber) {
        long num1 = firstNumber;
        long num2 = secondNumber;
        long mul = firstNumber * secondNumber;
        System.out.println("Mul of Digits =\t"+ mul);
    }
    //Second Method
    public long SecondMulLongNumberUsingMethod(long firstNumber, long secondNumber) {
        long num1 = firstNumber;
        long num2 = secondNumber;
        long mul = firstNumber * secondNumber;
        return mul;
    }
}

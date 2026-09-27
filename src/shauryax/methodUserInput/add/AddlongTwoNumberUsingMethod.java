package shauryax.methodUserInput.add;

import java.util.Scanner;

public class AddlongTwoNumberUsingMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter you First Digit\t");
        long firstNumber = scan.nextLong();
        System.out.print("Enter your Second Digit\t");
        long secondNumber = scan.nextLong();
        //Create Object
        AddlongTwoNumberUsingMethod AddlongTwoNumber = new AddlongTwoNumberUsingMethod();
        //Method Call
        AddlongTwoNumber.FirstAddLongNumberUsingMethod(firstNumber, secondNumber);    //First Method
        //Store Method in Variable & Method Call
        long sum = AddlongTwoNumber.SecondAddLongNumberUsingMethod(firstNumber,secondNumber);  //Second Method
        System.out.println("Sum of Digits =\t"+sum);
    }
    //First Method
    public void FirstAddLongNumberUsingMethod(long firstNumber, long secondNumber) {
        long num1 = firstNumber;
        long num2 = secondNumber;
        long sum = firstNumber + secondNumber;
        System.out.println("Sum of Digits =\t"+ sum);
    }
    //Second Method
    public long SecondAddLongNumberUsingMethod(long firstNumber, long secondNumber) {
        long num1 = firstNumber;
        long num2 = secondNumber;
        long sum = firstNumber + secondNumber;
        return sum;
    }
}

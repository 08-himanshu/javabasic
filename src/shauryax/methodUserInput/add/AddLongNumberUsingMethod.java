package shauryax.methodUserInput.add;

import java.util.Scanner;

public class AddLongNumberUsingMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter you First Digit\t");
        Long firstNumber = scan.nextLong();
        System.out.print("Enter your Second Digit\t");
        Long secondNumber = scan.nextLong();
        //Create Object
        AddLongNumberUsingMethod AddLongTwoNumber = new AddLongNumberUsingMethod();
        //Method Call
        AddLongTwoNumber.FirstAddLongNumberUsingMethod(firstNumber, secondNumber);    //First Method
        //Store Method in Variable & Method Call
        Long sum = AddLongTwoNumber.SecondAddLongNumberUsingMethod(firstNumber,secondNumber);  //Second Method
        System.out.println("Sum of Digits =\t"+sum);
    }
    //First Method
    public void FirstAddLongNumberUsingMethod(Long firstNumber, Long secondNumber) {
        Long num1 = firstNumber;
        Long num2 = secondNumber;
        Long sum = firstNumber + secondNumber;
        System.out.println("Sum of Digits =\t"+ sum);
    }
    //Second Method
    public Long SecondAddLongNumberUsingMethod(Long firstNumber, Long secondNumber) {
        Long num1 = firstNumber;
        Long num2 = secondNumber;
        Long sum = firstNumber + secondNumber;
        return sum;
    }
}

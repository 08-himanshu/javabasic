package shauryax.methodUserInput.add;

import java.util.Scanner;

public class AddIntegerTwwwwNumberUsingMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter you First Digit\t");
        Integer firstNumber = scan.nextInt();
        System.out.print("Enter your Second Digit\t");
        Integer secondNumber = scan.nextInt();
        //Create Object
        AddIntegerTwwwwNumberUsingMethod AddIntegerTwoNumber = new AddIntegerTwwwwNumberUsingMethod();
        //Method Call
        AddIntegerTwoNumber.FirstAddIntegerNumberUsingMethod(firstNumber, secondNumber);    //First Method
        //Store Method in Variable & Method Call
        Integer sum = AddIntegerTwoNumber.SecondAddIntNumberUsingMethod(firstNumber, secondNumber); //Second Method
        System.out.println("Sum of Digits =\t"+ sum);
    }
    //First Method
    public void FirstAddIntegerNumberUsingMethod(Integer firstNumber, Integer secondNumber) {
        Integer num1 = firstNumber;
        Integer num2 = secondNumber;
        Integer sum = num1 + num2;
        System.out.println("Sum of Digits =\t"+ sum);
    }
    //Second Method
    public Integer SecondAddIntNumberUsingMethod(Integer firstNumber, Integer secondNumber) {
        Integer num1 = firstNumber;
        Integer num2 = secondNumber;
        Integer sum = num1 + num2;
        return sum;
    }
}
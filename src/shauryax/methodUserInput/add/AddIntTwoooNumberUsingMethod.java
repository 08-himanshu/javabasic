package shauryax.methodUserInput.add;

import java.util.Scanner;

public class AddIntTwoooNumberUsingMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter you First Digit\t");
        int firstNumber = scan.nextInt();
        System.out.print("Enter your Second Digit\t");
        int secondNumber = scan.nextInt();
        //Create Object
        AddIntTwoooNumberUsingMethod AddIntTwoNumber = new AddIntTwoooNumberUsingMethod();
        //Method Call
        AddIntTwoNumber.FirstAddIntNumberUsingMethod(firstNumber, secondNumber);    //First Method
        //Store Method in Variable & Method Call
        int sum = AddIntTwoNumber.SecondAddIntNumberUsingMethod(firstNumber,secondNumber);  //Second Method
        System.out.println("Sum of Digits =\t"+ sum);
    }
    //First Method
    public void FirstAddIntNumberUsingMethod(int firstNumber, int secondNumber) {
        int num1 = firstNumber;
        int num2 = secondNumber;
        int sum = firstNumber + secondNumber;
        System.out.println("Sum of Digits =\t"+ sum);
    }
    //Second Method
    public int SecondAddIntNumberUsingMethod(int firstNumber, int secondNumber) {
        int num1 = firstNumber;
        int num2 = secondNumber;
        int sum = firstNumber + secondNumber;
        return sum;
    }
}

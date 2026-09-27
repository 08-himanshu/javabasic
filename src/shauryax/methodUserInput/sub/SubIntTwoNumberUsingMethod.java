package shauryax.methodUserInput.sub;

import java.util.Scanner;

public class SubIntTwoNumberUsingMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter you First Digit\t");
        int firstNumber = scan.nextInt();
        System.out.print("Enter your Second Digit\t");
        int secondNumber = scan.nextInt();
        //Create Object
        SubIntTwoNumberUsingMethod SubIntTwoNumber = new SubIntTwoNumberUsingMethod();
        //Method Call
        SubIntTwoNumber.FirstSubIntNumberUsingMethod(firstNumber, secondNumber);    //First Method
        //Store Method in Variable & Method Call
        int sub = SubIntTwoNumber.SecondSubIntNumberUsingMethod(firstNumber,secondNumber);  //Second Method
        System.out.println("Sub of Digits =\t"+ sub);
    }
    //First Method
    public void FirstSubIntNumberUsingMethod(int firstNumber, int secondNumber) {
        int num1 = firstNumber;
        int num2 = secondNumber;
        int sub = firstNumber - secondNumber;
        System.out.println("Sub of Digits =\t"+ sub);
    }
    //Second Method
    public int SecondSubIntNumberUsingMethod(int firstNumber, int secondNumber) {
        int num1 = firstNumber;
        int num2 = secondNumber;
        int sub = firstNumber - secondNumber;
        return sub;
    }
}

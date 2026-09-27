package shauryax.methodUserInput.sub;

import java.util.Scanner;

public class SubIntegerTwoNumberUsingMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter you First Digit\t");
        Integer firstNumber = scan.nextInt();
        System.out.print("Enter your Second Digit\t");
        Integer secondNumber = scan.nextInt();
        //Create Object
        SubIntegerTwoNumberUsingMethod SubIntegerTwoNumber = new SubIntegerTwoNumberUsingMethod();
        //Method Call
        SubIntegerTwoNumber.FirstSubIntegerNumberUsingMethod(firstNumber, secondNumber);    //First Method
        //Store Method in Variable & Method Call
        Integer sub = SubIntegerTwoNumber.SecondSubIntNumberUsingMethod(firstNumber, secondNumber); //Second Method
        System.out.println("Sub of Digits =\t"+ sub);
    }
    //First Method
    public void FirstSubIntegerNumberUsingMethod(Integer firstNumber, Integer secondNumber) {
        Integer num1 = firstNumber;
        Integer num2 = secondNumber;
        Integer sub = firstNumber - secondNumber;
        System.out.println("Sub of Digits =\t"+ sub);
    }
    //Second Method
    public Integer SecondSubIntNumberUsingMethod(Integer firstNumber, Integer secondNumber) {
        Integer num1 = firstNumber;
        Integer num2 = secondNumber;
        Integer sub = firstNumber - secondNumber;
        return sub;
    }
}
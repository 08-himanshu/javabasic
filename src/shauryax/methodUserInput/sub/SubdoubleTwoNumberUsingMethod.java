package shauryax.methodUserInput.sub;

import java.util.Scanner;

public class SubdoubleTwoNumberUsingMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your First Integer Parameter\t");
        double firstNumber = scan.nextInt();
        System.out.print("Enter Your Second Integer Parameter\t");
        double secondNumber = scan.nextInt();
        //Create Object
        SubdoubleTwoNumberUsingMethod SubDoubleTypeNumber = new SubdoubleTwoNumberUsingMethod();
        //Method Call
        SubDoubleTypeNumber.FirstSubDoubleTypeNumberUsingMethod(firstNumber, secondNumber);    //First Method
        //Store Method in Variable & Method Call
        double sub = SubDoubleTypeNumber.SecondSubDoubleTypeNumberUsingMethod(firstNumber, secondNumber);   //Second Method
        System.out.println("The Sub is\t" + sub);
    }
    //First Method
    public void FirstSubDoubleTypeNumberUsingMethod(double firstNumber,double secondNumber) {
        double num1 = firstNumber;
        double num2 = secondNumber;
        double sub = num1 - num2;
        System.out.println("The Sub is\t" + sub);
    }
    //First Method
    public double SecondSubDoubleTypeNumberUsingMethod(double firstNumber,double secondNumber) {
        double num1 = firstNumber;
        double num2 = secondNumber;
        double sub = num1 - num2;
        return sub;
    }
}
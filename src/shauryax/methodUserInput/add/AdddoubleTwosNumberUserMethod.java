package shauryax.methodUserInput.add;

import java.util.Scanner;

public class AdddoubleTwosNumberUserMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your First Integer Parameter\t");
        double firstNumber = scan.nextInt();
        System.out.print("Enter Your Second Integer Parameter\t");
        double secondNumber = scan.nextInt();
        //Create Object
        AdddoubleTwosNumberUserMethod AddDoubleTypeNumber = new AdddoubleTwosNumberUserMethod();
        //Method Call
        AddDoubleTypeNumber.FirstAddDoubleTypeNumberUsingMethod(firstNumber, secondNumber);    //First Method
        //Store Method in Variable & Method Call
        double sum = AddDoubleTypeNumber.SecondAddDoubleTypeNumberUsingMethod(firstNumber, secondNumber);   //Second Method
        System.out.println("The Sum is\t" + sum);
    }
    //First Method
    public void FirstAddDoubleTypeNumberUsingMethod(double firstNumber,double secondNumber) {
        double num1 = firstNumber;
        double num2 = secondNumber;
        double sum = num1 + num2;
        System.out.println("The Sum is\t" + sum);
    }
    //First Method
    public double SecondAddDoubleTypeNumberUsingMethod(double firstNumber,double secondNumber) {
        double num1 = firstNumber;
        double num2 = secondNumber;
        double sum = num1 + num2;
        return sum;
    }
}
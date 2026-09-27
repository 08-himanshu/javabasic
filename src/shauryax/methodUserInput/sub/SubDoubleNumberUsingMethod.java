package shauryax.methodUserInput.sub;

import java.util.Scanner;

public class SubDoubleNumberUsingMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your First Integer Parameter\t");
        Double firstNumber = scan.nextDouble();
        System.out.print("Enter Your Second Integer Parameter\t");
        Double secondNumber = scan.nextDouble();
        //Create Object
        SubDoubleNumberUsingMethod SubDoubleTypeNumber = new SubDoubleNumberUsingMethod();
        //Method Call
        SubDoubleTypeNumber.FirstSubDoubleTypeNumberUsingMethod(firstNumber, secondNumber);    //First Method
        //Store Method in Variable & Method Call
        Double sub = SubDoubleTypeNumber.SecondSubDoubleTypeNumberUsingMethod(firstNumber, secondNumber);   //Second Method
        System.out.println("The sub is\t" + sub);
    }
    //First Method
    public void FirstSubDoubleTypeNumberUsingMethod(Double firstNumber,Double secondNumber) {
        Double num1 = firstNumber;
        Double num2 = secondNumber;
        Double sub = num1 + num2;
        System.out.println("The sub is\t" + sub);
    }
    //Second Method
    public Double SecondSubDoubleTypeNumberUsingMethod(Double firstNumber,Double secondNumber) {
        Double num1 = firstNumber;
        Double num2 = secondNumber;
        Double sub = num1 + num2;
        return sub;
    }
}
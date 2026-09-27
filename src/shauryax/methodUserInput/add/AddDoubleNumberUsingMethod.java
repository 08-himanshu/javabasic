package shauryax.methodUserInput.add;

import java.util.Scanner;

public class AddDoubleNumberUsingMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your First Integer Parameter\t");
        Double firstNumber = scan.nextDouble();
        System.out.print("Enter Your Second Integer Parameter\t");
        Double secondNumber = scan.nextDouble();
        //Create Object
        AddDoubleNumberUsingMethod AddDoubleTypeNumber = new AddDoubleNumberUsingMethod();
        //Method Call
        AddDoubleTypeNumber.FirstAddDoubleTypeNumberUsingMethod(firstNumber, secondNumber);    //First Method
        //Store Method in Variable & Method Call
        Double sum = AddDoubleTypeNumber.SecondAddDoubleTypeNumberUsingMethod(firstNumber, secondNumber);   //Second Method
        System.out.println("The Sum is\t" + sum);
    }
    //First Method
    public void FirstAddDoubleTypeNumberUsingMethod(Double firstNumber, Double secondNumber) {
        Double num1 = firstNumber;
        Double num2 = secondNumber;
        Double sum = num1 + num2;
        System.out.println("The Sum is\t" + sum);
    }
    //Second Method
    public Double SecondAddDoubleTypeNumberUsingMethod(Double firstNumber,Double secondNumber) {
        Double num1 = firstNumber;
        Double num2 = secondNumber;
        Double sum = num1 + num2;
        return sum;
    }
}
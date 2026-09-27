package shauryax.methodUserInput.div;

import java.util.Scanner;

public class DivdoubleTwoNumberUserMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your First Integer Parameter\t");
        double firstNumber = scan.nextInt();
        System.out.print("Enter Your Second Integer Parameter\t");
        double secondNumber = scan.nextInt();
        //Create Object
        DivdoubleTwoNumberUserMethod DivDoubleTypeNumber = new DivdoubleTwoNumberUserMethod();
        //Method Call
        DivDoubleTypeNumber.FirstDivDoubleTypeNumberUsingMethod(firstNumber, secondNumber);    //First Method
        //Store Method in Variable & Method Call
        double div = DivDoubleTypeNumber.SecondDivDoubleTypeNumberUsingMethod(firstNumber, secondNumber);   //Second Method
        System.out.println("The Div is\t" + div);
    }
    //First Method
    public void FirstDivDoubleTypeNumberUsingMethod(double firstNumber,double secondNumber) {
        double num1 = firstNumber;
        double num2 = secondNumber;
        double div = num1 / num2;
        System.out.println("The Div is\t" + div);
    }
    //First Method
    public double SecondDivDoubleTypeNumberUsingMethod(double firstNumber,double secondNumber) {
        double num1 = firstNumber;
        double num2 = secondNumber;
        double div = num1 / num2;
        return div;
    }
}
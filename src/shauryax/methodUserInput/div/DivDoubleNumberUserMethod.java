package shauryax.methodUserInput.div;

import java.util.Scanner;

public class DivDoubleNumberUserMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your First Integer Parameter\t");
        Double firstNumber = scan.nextDouble();
        System.out.print("Enter Your Second Integer Parameter\t");
        Double secondNumber = scan.nextDouble();
        //Create Object
        DivDoubleNumberUserMethod DivDoubleTypeNumber = new DivDoubleNumberUserMethod();
        //Method Call
        DivDoubleTypeNumber.FirstDivDoubleTypeNumberUsingMethod(firstNumber, secondNumber);    //First Method
        //Store Method in Variable & Method Call
        Double div = DivDoubleTypeNumber.SecondDivDoubleTypeNumberUsingMethod(firstNumber, secondNumber);   //Second Method
        System.out.println("The Div is\t" + div);
    }
    //First Method
    public void FirstDivDoubleTypeNumberUsingMethod(Double firstNumber,Double secondNumber) {
        Double num1 = firstNumber;
        Double num2 = secondNumber;
        Double div = num1 / num2;
        System.out.println("The Div is\t" + div);
    }
    //Second Method
    public Double SecondDivDoubleTypeNumberUsingMethod(Double firstNumber,Double secondNumber) {
        Double num1 = firstNumber;
        Double num2 = secondNumber;
        Double div = num1 / num2;
        return div;
    }
}
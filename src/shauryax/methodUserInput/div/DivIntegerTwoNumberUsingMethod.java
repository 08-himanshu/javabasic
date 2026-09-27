package shauryax.methodUserInput.div;

import java.util.Scanner;

public class DivIntegerTwoNumberUsingMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter you First Digit\t");
        Integer firstNumber = scan.nextInt();
        System.out.print("Enter your Second Digit\t");
        Integer secondNumber = scan.nextInt();
        //Create Object
        DivIntegerTwoNumberUsingMethod DivIntegerTwoNumber = new DivIntegerTwoNumberUsingMethod();
        //Method Call
        DivIntegerTwoNumber.FirstDivIntegerNumberUsingMethod(firstNumber, secondNumber);    //First Method
        //Store Method in Variable & Method Call
        Integer div = DivIntegerTwoNumber.SecondDivIntNumberUsingMethod(firstNumber, secondNumber); //Second Method
        System.out.println("Div of Digits =\t"+ div);
    }
    //First Method
    public void FirstDivIntegerNumberUsingMethod(Integer firstNumber, Integer secondNumber) {
        Integer num1 = firstNumber;
        Integer num2 = secondNumber;
        Integer div = firstNumber / secondNumber;
        System.out.println("Div of Digits =\t"+ div);
    }
    //Second Method
    public Integer SecondDivIntNumberUsingMethod(Integer firstNumber, Integer secondNumber) {
        Integer num1 = firstNumber;
        Integer num2 = secondNumber;
        Integer div = firstNumber / secondNumber;
        return div;
    }
}
package shauryax.methodUserInput.div;

import java.util.Scanner;

public class DivIntTwoNumberUsingMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter you First Digit\t");
        int firstNumber = scan.nextInt();
        System.out.print("Enter your Second Digit\t");
        int secondNumber = scan.nextInt();
        //Create Object
        DivIntTwoNumberUsingMethod DivIntTwoNumber = new DivIntTwoNumberUsingMethod();
        //Method Call
        DivIntTwoNumber.FirstDivIntNumberUsingMethod(firstNumber, secondNumber);    //First Method
        //Store Method in Variable & Method Call
        int div = DivIntTwoNumber.SecondDivIntNumberUsingMethod(firstNumber,secondNumber);  //Second Method
        System.out.println("Div of Digits =\t"+ div);
    }
    //First Method
    public void FirstDivIntNumberUsingMethod(int firstNumber, int secondNumber) {
        int num1 = firstNumber;
        int num2 = secondNumber;
        int div = firstNumber / secondNumber;
        System.out.println("Div of Digits =\t"+ div);
    }
    //Second Method
    public int SecondDivIntNumberUsingMethod(int firstNumber, int secondNumber) {
        int num1 = firstNumber;
        int num2 = secondNumber;
        int div = firstNumber / secondNumber;
        return div;
    }
}

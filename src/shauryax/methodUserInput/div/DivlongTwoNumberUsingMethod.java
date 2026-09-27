package shauryax.methodUserInput.div;

import java.util.Scanner;

public class DivlongTwoNumberUsingMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter you First Digit\t");
        long firstNumber = scan.nextLong();
        System.out.print("Enter your Second Digit\t");
        long secondNumber = scan.nextLong();
        //Create Object
        DivlongTwoNumberUsingMethod DivlongTwoNumber = new DivlongTwoNumberUsingMethod();
        //Method Call
        DivlongTwoNumber.FirstDivLongNumberUsingMethod(firstNumber, secondNumber);    //First Method
        //Store Method in Variable & Method Call
        long div = DivlongTwoNumber.SecondDivLongNumberUsingMethod(firstNumber,secondNumber);  //Second Method
        System.out.println("Div of Digits =\t"+ div);
    }
    //First Method
    public void FirstDivLongNumberUsingMethod(long firstNumber, long secondNumber) {
        long num1 = firstNumber;
        long num2 = secondNumber;
        long div = firstNumber / secondNumber;
        System.out.println("Div of Digits =\t"+ div);
    }
    //Second Method
    public long SecondDivLongNumberUsingMethod(long firstNumber, long secondNumber) {
        long num1 = firstNumber;
        long num2 = secondNumber;
        long div = firstNumber / secondNumber;
        return div;
    }
}

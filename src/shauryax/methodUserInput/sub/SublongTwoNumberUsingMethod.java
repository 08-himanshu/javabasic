package shauryax.methodUserInput.sub;

import java.util.Scanner;

public class SublongTwoNumberUsingMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter you First Digit\t");
        long firstNumber = scan.nextLong();
        System.out.print("Enter your Second Digit\t");
        long secondNumber = scan.nextLong();
        //Create Object
        SublongTwoNumberUsingMethod SublongTwoNumber = new SublongTwoNumberUsingMethod();
        //Method Call
        SublongTwoNumber.FirstSubLongNumberUsingMethod(firstNumber, secondNumber);    //First Method
        //Store Method in Variable & Method Call
        long sub = SublongTwoNumber.SecondSubLongNumberUsingMethod(firstNumber,secondNumber);  //Second Method
        System.out.println("Sub of Digits =\t"+sub);
    }
    //First Method
    public void FirstSubLongNumberUsingMethod(long firstNumber, long secondNumber) {
        long num1 = firstNumber;
        long num2 = secondNumber;
        long sub = firstNumber - secondNumber;
        System.out.println("Sub of Digits =\t"+ sub);
    }
    //Second Method
    public long SecondSubLongNumberUsingMethod(long firstNumber, long secondNumber) {
        long num1 = firstNumber;
        long num2 = secondNumber;
        long sub = firstNumber - secondNumber;
        return sub;
    }
}

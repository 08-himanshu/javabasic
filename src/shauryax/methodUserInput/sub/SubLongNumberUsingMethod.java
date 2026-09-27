package shauryax.methodUserInput.sub;

import java.util.Scanner;

public class SubLongNumberUsingMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter you First Digit\t");
        Long firstNumber = scan.nextLong();
        System.out.print("Enter your Second Digit\t");
        Long secondNumber = scan.nextLong();
        //Create Object
        SubLongNumberUsingMethod SubLongTwoNumber = new SubLongNumberUsingMethod();
        //Method Call
        SubLongTwoNumber.FirstSubLongNumberUsingMethod(firstNumber, secondNumber);    //First Method
        //Store Method in Variable & Method Call
        Long sub = SubLongTwoNumber.SecondSubLongNumberUsingMethod(firstNumber,secondNumber);  //Second Method
        System.out.println("Sub of Digits =\t"+sub);
    }
    //First Method
    public void FirstSubLongNumberUsingMethod(Long firstNumber, Long secondNumber) {
        Long num1 = firstNumber;
        Long num2 = secondNumber;
        Long sub = firstNumber - secondNumber;
        System.out.println("Sub of Digits =\t"+ sub);
    }
    //Second Method
    public Long SecondSubLongNumberUsingMethod(Long firstNumber, Long secondNumber) {
        Long num1 = firstNumber;
        Long num2 = secondNumber;
        Long sub = firstNumber - secondNumber;
        return sub;
    }
}

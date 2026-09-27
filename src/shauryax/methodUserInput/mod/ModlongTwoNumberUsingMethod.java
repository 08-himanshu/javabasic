package shauryax.methodUserInput.mod;

import java.util.Scanner;

public class ModlongTwoNumberUsingMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter you First Digit\t");
        long firstNumber = scan.nextLong();
        System.out.print("Enter your Second Digit\t");
        long secondNumber = scan.nextLong();
        //Create Object
        ModlongTwoNumberUsingMethod ModlongTwoNumber = new ModlongTwoNumberUsingMethod();
        //Method Call
        ModlongTwoNumber.FirstModLongNumberUsingMethod(firstNumber, secondNumber);    //First Method
        //Store Method in Variable & Method Call
        long Mod = ModlongTwoNumber.SecondModLongNumberUsingMethod(firstNumber,secondNumber);  //Second Method
        System.out.println("Mod of Digits =\t"+ Mod);
    }
    //First Method
    public void FirstModLongNumberUsingMethod(long firstNumber, long secondNumber) {
        long num1 = firstNumber;
        long num2 = secondNumber;
        long Mod = firstNumber % secondNumber;
        System.out.println("Mod of Digits =\t"+ Mod);
    }
    //Second Method
    public long SecondModLongNumberUsingMethod(long firstNumber, long secondNumber) {
        long num1 = firstNumber;
        long num2 = secondNumber;
        long Mod = firstNumber % secondNumber;
        return Mod;
    }
}

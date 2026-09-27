package shauryax.methodUserInput.mod;

import java.util.Scanner;

public class ModIntegerTwoNumberUsingMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter you First Digit\t");
        Integer firstNumber = scan.nextInt();
        System.out.print("Enter your Second Digit\t");
        Integer secondNumber = scan.nextInt();
        //Create Object
        ModIntegerTwoNumberUsingMethod ModIntegerTwoNumber = new ModIntegerTwoNumberUsingMethod();
        //Method Call
        ModIntegerTwoNumber.FirstModIntegerNumberUsingMethod(firstNumber, secondNumber);    //First Method
        //Store Method in Variable & Method Call
        Integer Mod = ModIntegerTwoNumber.SecondModIntNumberUsingMethod(firstNumber, secondNumber); //Second Method
        System.out.println("Mod of Digits =\t"+ Mod);
    }
    //First Method
    public void FirstModIntegerNumberUsingMethod(Integer firstNumber, Integer secondNumber) {
        Integer num1 = firstNumber;
        Integer num2 = secondNumber;
        Integer Mod = firstNumber % secondNumber;
        System.out.println("Mod of Digits =\t"+ Mod);
    }
    //Second Method
    public Integer SecondModIntNumberUsingMethod(Integer firstNumber, Integer secondNumber) {
        Integer num1 = firstNumber;
        Integer num2 = secondNumber;
        Integer Mod = firstNumber % secondNumber;
        return Mod;
    }
}
package shauryax.methodUserInput.mod;

import java.util.Scanner;

public class ModIntTwoNumberUsingMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter you First Digit\t");
        int firstNumber = scan.nextInt();
        System.out.print("Enter your Second Digit\t");
        int secondNumber = scan.nextInt();
        //Create Object
        ModIntTwoNumberUsingMethod ModIntTwoNumber = new ModIntTwoNumberUsingMethod();
        //Method Call
        ModIntTwoNumber.FirstModIntNumberUsingMethod(firstNumber, secondNumber);    //First Method
        //Store Method in Variable & Method Call
        int Mod = ModIntTwoNumber.SecondModIntNumberUsingMethod(firstNumber,secondNumber);  //Second Method
        System.out.println("Mod of Digits =\t"+ Mod);
    }
    //First Method
    public void FirstModIntNumberUsingMethod(int firstNumber, int secondNumber) {
        int num1 = firstNumber;
        int num2 = secondNumber;
        int Mod = firstNumber % secondNumber;
        System.out.println("Mod of Digits =\t"+ Mod);
    }
    //Second Method
    public int SecondModIntNumberUsingMethod(int firstNumber, int secondNumber) {
        int num1 = firstNumber;
        int num2 = secondNumber;
        int Mod = firstNumber % secondNumber;
        return Mod;
    }
}

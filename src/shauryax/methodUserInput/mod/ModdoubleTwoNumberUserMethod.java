package shauryax.methodUserInput.mod;

import java.util.Scanner;

public class ModdoubleTwoNumberUserMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your First Integer Parameter\t");
        double firstNumber = scan.nextInt();
        System.out.print("Enter Your Second Integer Parameter\t");
        double secondNumber = scan.nextInt();
        //Create Object
        ModdoubleTwoNumberUserMethod ModDoubleTypeNumber = new ModdoubleTwoNumberUserMethod();
        //Method Call
        ModDoubleTypeNumber.FirstModDoubleTypeNumberUsingMethod(firstNumber, secondNumber);    //First Method
        //Store Method in Variable & Method Call
        double Mod = ModDoubleTypeNumber.SecondModDoubleTypeNumberUsingMethod(firstNumber, secondNumber);   //Second Method
        System.out.println("The Mod is\t" + Mod);
    }
    //First Method
    public void FirstModDoubleTypeNumberUsingMethod(double firstNumber,double secondNumber) {
        double num1 = firstNumber;
        double num2 = secondNumber;
        double Mod = num1 % num2;
        System.out.println("The Mod is\t" + Mod);
    }
    //First Method
    public double SecondModDoubleTypeNumberUsingMethod(double firstNumber,double secondNumber) {
        double num1 = firstNumber;
        double num2 = secondNumber;
        double Mod = num1 % num2;
        return Mod;
    }
}
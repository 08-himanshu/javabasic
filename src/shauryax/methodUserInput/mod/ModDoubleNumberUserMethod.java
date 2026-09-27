package shauryax.methodUserInput.mod;

import java.util.Scanner;

public class ModDoubleNumberUserMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your First Integer Parameter\t");
        Double firstNumber = scan.nextDouble();
        System.out.print("Enter Your Second Integer Parameter\t");
        Double secondNumber = scan.nextDouble();
        //Create Object
        ModDoubleNumberUserMethod ModDoubleTypeNumber = new ModDoubleNumberUserMethod();
        //Method Call
        ModDoubleTypeNumber.FirstModDoubleTypeNumberUsingMethod(firstNumber, secondNumber);    //First Method
        //Store Method in Variable & Method Call
        Double Mod = ModDoubleTypeNumber.SecondModDoubleTypeNumberUsingMethod(firstNumber, secondNumber);   //Second Method
        System.out.println("The Mod is\t" + Mod);
    }
    //First Method
    public void FirstModDoubleTypeNumberUsingMethod(Double firstNumber,Double secondNumber) {
        Double num1 = firstNumber;
        Double num2 = secondNumber;
        Double Mod = num1 % num2;
        System.out.println("The Mod is\t" + Mod);
    }
    //Second Method
    public Double SecondModDoubleTypeNumberUsingMethod(Double firstNumber,Double secondNumber) {
        Double num1 = firstNumber;
        Double num2 = secondNumber;
        Double Mod = num1 % num2;
        return Mod;
    }
}
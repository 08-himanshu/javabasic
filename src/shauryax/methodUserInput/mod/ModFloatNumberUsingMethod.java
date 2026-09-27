package shauryax.methodUserInput.mod;

import java.util.Scanner;

public class ModFloatNumberUsingMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your First Integer Parameter\t");
        Float firstNumber = scan.nextFloat();
        System.out.print("Enter Your Second Integer Parameter\t");
        Float secondNumber = scan.nextFloat();
        //Create Object
        ModFloatNumberUsingMethod ModFloatTypeNumber = new ModFloatNumberUsingMethod();
        //Method Call
        ModFloatTypeNumber.FirstModFloatTypeNumberUsingMethod(firstNumber, secondNumber);   //First Method
        //Store Method in Variable & Method Call
        Float Mod = ModFloatTypeNumber.SecondModFloatTypeNumberUsingMethod(firstNumber, secondNumber);  //Second Method
        System.out.println("The Mod is\t"+ Mod);
    }
    //First Method
    public void FirstModFloatTypeNumberUsingMethod(Float firstNumber,Float secondNumber){
        Float num1 = firstNumber;
        Float num2 = secondNumber;
        Float Mod = num1 % num2;
        System.out.println("The Mod is\t" + Mod);
    }
    //Second Method
    public Float SecondModFloatTypeNumberUsingMethod(Float firstNumber,Float secondNumber) {
        Float num1 = firstNumber;
        Float num2 = secondNumber;
        Float Mod = num1 % num2;
        return Mod;
    }
}
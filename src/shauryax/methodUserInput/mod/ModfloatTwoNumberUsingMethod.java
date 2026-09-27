package shauryax.methodUserInput.mod;

import java.util.Scanner;

public class ModfloatTwoNumberUsingMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your First Integer Parameter\t");
        float firstNumber = scan.nextFloat();
        System.out.print("Enter Your Second Integer Parameter\t");
        float secondNumber = scan.nextFloat();
        //Create Object
        ModfloatTwoNumberUsingMethod ModfloatTypeNumber = new ModfloatTwoNumberUsingMethod();
        //Method Call
        ModfloatTypeNumber.FirstModfloatTypeNumberUsingMethod(firstNumber, secondNumber);   //First Method
        //Store Method in Variable & Method Call
        float Mod = ModfloatTypeNumber.SecondModfloatTypeNumberUsingMethod(firstNumber, secondNumber);  //Second Method
        System.out.println("The Mod is\t"+ Mod);
    }
    //First Method
    public void FirstModfloatTypeNumberUsingMethod(float firstNumber,float secondNumber){
        float num1 = firstNumber;
        float num2 = secondNumber;
        float Mod = num1 % num2;
        System.out.println("The Mod is\t" + Mod);
    }
    //Second Method
    public float SecondModfloatTypeNumberUsingMethod(float firstNumber,float secondNumber) {
        float num1 = firstNumber;
        float num2 = secondNumber;
        float Mod = num1 % num2;
        return Mod;
    }
}
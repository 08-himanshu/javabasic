package shauryax.methodUserInput.sub;

import java.util.Scanner;

public class SubFloatNumberUsingMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your First Integer Parameter\t");
        Float firstNumber = scan.nextFloat();
        System.out.print("Enter Your Second Integer Parameter\t");
        Float secondNumber = scan.nextFloat();
        //Create Object
        SubFloatNumberUsingMethod SubFloatTypeNumber = new SubFloatNumberUsingMethod();
        //Method Call
        SubFloatTypeNumber.FirstSubFloatTypeNumberUsingMethod(firstNumber, secondNumber);   //First Method
        //Store Method in Variable & Method Call
        Float sub = SubFloatTypeNumber.SecondSubFloatTypeNumberUsingMethod(firstNumber, secondNumber);  //Second Method
        System.out.println("The Sub is\t"+ sub);
    }
    //First Method
    public void FirstSubFloatTypeNumberUsingMethod(Float firstNumber,Float secondNumber){
        Float num1 = firstNumber;
        Float num2 = secondNumber;
        Float sub = num1 - num2;
        System.out.println("The Sub is\t" + sub);
    }
    //Second Method
    public Float SecondSubFloatTypeNumberUsingMethod(Float firstNumber,Float secondNumber) {
        Float num3 = firstNumber;
        Float num4 = secondNumber;
        Float sub = num3 - num4;
        return sub;
    }
}
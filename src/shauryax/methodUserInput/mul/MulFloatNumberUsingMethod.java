package shauryax.methodUserInput.mul;

import java.util.Scanner;

public class MulFloatNumberUsingMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your First Integer Parameter\t");
        Float firstNumber = scan.nextFloat();
        System.out.print("Enter Your Second Integer Parameter\t");
        Float secondNumber = scan.nextFloat();
        //Create Object
        MulFloatNumberUsingMethod MulFloatTypeNumber = new MulFloatNumberUsingMethod();
        //Method Call
        MulFloatTypeNumber.FirstMulFloatTypeNumberUsingMethod(firstNumber, secondNumber);   //First Method
        //Store Method in Variable & Method Call
        Float mul = MulFloatTypeNumber.SecondMulFloatTypeNumberUsingMethod(firstNumber, secondNumber);  //Second Method
        System.out.println("The Mul is\t"+ mul);
    }
    //First Method
    public void FirstMulFloatTypeNumberUsingMethod(Float firstNumber,Float secondNumber){
        Float num1 = firstNumber;
        Float num2 = secondNumber;
        Float mul = num1 * num2;
        System.out.println("The Mul is\t" + mul);
    }
    //Second Method
    public Float SecondMulFloatTypeNumberUsingMethod(Float firstNumber,Float secondNumber) {
        Float num3 = firstNumber;
        Float num4 = secondNumber;
        Float mul = num3 * num4;
        return mul;
    }
}
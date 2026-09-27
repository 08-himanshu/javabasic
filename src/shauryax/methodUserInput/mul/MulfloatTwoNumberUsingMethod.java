package shauryax.methodUserInput.mul;

import java.util.Scanner;

public class MulfloatTwoNumberUsingMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your First Integer Parameter\t");
        float firstNumber = scan.nextFloat();
        System.out.print("Enter Your Second Integer Parameter\t");
        float secondNumber = scan.nextFloat();
        //Create Object
        MulfloatTwoNumberUsingMethod MulfloatTypeNumber = new MulfloatTwoNumberUsingMethod();
        //Method Call
        MulfloatTypeNumber.FirstMulfloatTypeNumberUsingMethod(firstNumber, secondNumber);   //First Method
        //Store Method in Variable & Method Call
        float mul = MulfloatTypeNumber.SecondMulfloatTypeNumberUsingMethod(firstNumber, secondNumber);  //Second Method
        System.out.println("The Mul is\t"+ mul);
    }
    //First Method
    public void FirstMulfloatTypeNumberUsingMethod(float firstNumber,float secondNumber){
        float num1 = firstNumber;
        float num2 = secondNumber;
        float mul = num1 * num2;
        System.out.println("The Mul is\t" + mul);
    }
    //Second Method
    public float SecondMulfloatTypeNumberUsingMethod(float firstNumber,float secondNumber) {
        float num3 = firstNumber;
        float num4 = secondNumber;
        float mul = num3 * num4;
        return mul;
    }
}
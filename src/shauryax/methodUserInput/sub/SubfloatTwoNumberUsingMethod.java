package shauryax.methodUserInput.sub;

import java.util.Scanner;

public class SubfloatTwoNumberUsingMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your First Integer Parameter\t");
        float firstNumber = scan.nextFloat();
        System.out.print("Enter Your Second Integer Parameter\t");
        float secondNumber = scan.nextFloat();
        //Create Object
        SubfloatTwoNumberUsingMethod SubfloatTypeNumber = new SubfloatTwoNumberUsingMethod();
        //Method Call
        SubfloatTypeNumber.FirstSubfloatTypeNumberUsingMethod(firstNumber, secondNumber);   //First Method
        //Store Method in Variable & Method Call
        float sub = SubfloatTypeNumber.SecondSubfloatTypeNumberUsingMethod(firstNumber, secondNumber);  //Second Method
        System.out.println("The Sub is\t"+ sub);
    }
    //First Method
    public void FirstSubfloatTypeNumberUsingMethod(float firstNumber,float secondNumber){
        float num1 = firstNumber;
        float num2 = secondNumber;
        float sub = num1 - num2;
        System.out.println("The Sub is\t" + sub);
    }
    //Second Method
    public float SecondSubfloatTypeNumberUsingMethod(float firstNumber,float secondNumber) {
        float num1 = firstNumber;
        float num2 = secondNumber;
        float sub = num1 - num2;
        return sub;
    }
}
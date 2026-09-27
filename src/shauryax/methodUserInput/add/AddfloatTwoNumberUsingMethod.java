package shauryax.methodUserInput.add;

import java.util.Scanner;

public class AddfloatTwoNumberUsingMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your First Integer Parameter\t");
        float firstNumber = scan.nextFloat();
        System.out.print("Enter Your Second Integer Parameter\t");
        float secondNumber = scan.nextFloat();
        //Create Object
        AddfloatTwoNumberUsingMethod AddfloatTypeNumber = new AddfloatTwoNumberUsingMethod();
        //Method Call
        AddfloatTypeNumber.FirstAddfloatTypeNumberUsingMethod(firstNumber, secondNumber);   //First Method
        //Store Method in Variable & Method Call
        float sum = AddfloatTypeNumber.SecondAddfloatTypeNumberUsingMethod(firstNumber, secondNumber);  //Second Method
        System.out.println("The Sum is\t"+sum);
    }
    //First Method
    public void FirstAddfloatTypeNumberUsingMethod(float firstNumber,float secondNumber){
        float num1 = firstNumber;
        float num2 = secondNumber;
        float sum = num1 + num2;
        System.out.println("The Sum is\t" + sum);
    }
    //Second Method
    public float SecondAddfloatTypeNumberUsingMethod(float firstNumber,float secondNumber) {
        float num3 = firstNumber;
        float num4 = secondNumber;
        float sum = num3 + num4;
        return sum;
    }
}
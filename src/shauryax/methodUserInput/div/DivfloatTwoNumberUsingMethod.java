package shauryax.methodUserInput.div;

import java.util.Scanner;

public class DivfloatTwoNumberUsingMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your First Integer Parameter\t");
        float firstNumber = scan.nextFloat();
        System.out.print("Enter Your Second Integer Parameter\t");
        float secondNumber = scan.nextFloat();
        //Create Object
        DivfloatTwoNumberUsingMethod DivfloatTypeNumber = new DivfloatTwoNumberUsingMethod();
        //Method Call
        DivfloatTypeNumber.FirstDivfloatTypeNumberUsingMethod(firstNumber, secondNumber);   //First Method
        //Store Method in Variable & Method Call
        float div = DivfloatTypeNumber.SecondDivfloatTypeNumberUsingMethod(firstNumber, secondNumber);  //Second Method
        System.out.println("The Div is\t"+ div);
    }
    //First Method
    public void FirstDivfloatTypeNumberUsingMethod(float firstNumber,float secondNumber){
        float num1 = firstNumber;
        float num2 = secondNumber;
        float div = num1 / num2;
        System.out.println("The Div is\t" + div);
    }
    //Second Method
    public float SecondDivfloatTypeNumberUsingMethod(float firstNumber,float secondNumber) {
        float num1 = firstNumber;
        float num2 = secondNumber;
        float div = num1 / num2;
        return div;
    }
}
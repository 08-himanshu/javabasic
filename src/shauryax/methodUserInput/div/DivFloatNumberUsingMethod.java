package shauryax.methodUserInput.div;

import java.util.Scanner;

public class DivFloatNumberUsingMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your First Integer Parameter\t");
        Float firstNumber = scan.nextFloat();
        System.out.print("Enter Your Second Integer Parameter\t");
        Float secondNumber = scan.nextFloat();
        //Create Object
        DivFloatNumberUsingMethod DivFloatTypeNumber = new DivFloatNumberUsingMethod();
        //Method Call
        DivFloatTypeNumber.FirstDivFloatTypeNumberUsingMethod(firstNumber, secondNumber);   //First Method
        //Store Method in Variable & Method Call
        Float div = DivFloatTypeNumber.SecondDivFloatTypeNumberUsingMethod(firstNumber, secondNumber);  //Second Method
        System.out.println("The Div is\t"+ div);
    }
    //First Method
    public void FirstDivFloatTypeNumberUsingMethod(Float firstNumber,Float secondNumber){
        Float num1 = firstNumber;
        Float num2 = secondNumber;
        Float Div = num1 / num2;
        System.out.println("The Div is\t" + Div);
    }
    //Second Method
    public Float SecondDivFloatTypeNumberUsingMethod(Float firstNumber,Float secondNumber) {
        Float num1 = firstNumber;
        Float num2 = secondNumber;
        Float Div = num1 / num2;
        return Div;
    }
}
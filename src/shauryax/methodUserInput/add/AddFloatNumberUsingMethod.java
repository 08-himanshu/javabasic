package shauryax.methodUserInput.add;

import java.util.Scanner;

public class AddFloatNumberUsingMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your First Integer Parameter\t");
        Float firstNumber = scan.nextFloat();
        System.out.print("Enter Your Second Integer Parameter\t");
        Float secondNumber = scan.nextFloat();
        //Create Object
        AddFloatNumberUsingMethod AddFloatTypeNumber = new AddFloatNumberUsingMethod();
        //Method Call
        AddFloatTypeNumber.FirstAddFloatTypeNumberUsingMethod(firstNumber, secondNumber);   //First Method
        //Store Method in Variable & Method Call
        Float sum = AddFloatTypeNumber.SecondAddFloatTypeNumberUsingMethod(firstNumber, secondNumber);  //Second Method
        System.out.println("The Sum is\t"+sum);
    }
    //First Method
    public void FirstAddFloatTypeNumberUsingMethod(Float firstNumber,Float secondNumber){
        Float num1 = firstNumber;
        Float num2 = secondNumber;
        Float sum = num1 + num2;
        System.out.println("The Sum is\t" + sum);
    }
    //Second Method
    public Float SecondAddFloatTypeNumberUsingMethod(Float firstNumber,Float secondNumber) {
        Float num3 = firstNumber;
        Float num4 = secondNumber;
        Float sum = num3 + num4;
        return sum;
    }
}
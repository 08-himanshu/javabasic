package shauryax.methodUserInput.mod;

import java.util.Scanner;

public class ModLongNumberUsingMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter you First Digit\t");
        Long firstNumber = scan.nextLong();
        System.out.print("Enter your Second Digit\t");
        Long secondNumber = scan.nextLong();
        //Create Object
        ModLongNumberUsingMethod ModLongTwoNumber = new ModLongNumberUsingMethod();
        //Method Call
        ModLongTwoNumber.FirstModLongNumberUsingMethod(firstNumber, secondNumber);    //First Method
        //Store Method in Variable & Method Call
        Long Mod = ModLongTwoNumber.SecondModLongNumberUsingMethod(firstNumber,secondNumber);  //Second Method
        System.out.println("Mod of Digits =\t"+ Mod);
    }
    //First Method
    public void FirstModLongNumberUsingMethod(Long firstNumber, Long secondNumber) {
        Long num1 = firstNumber;
        Long num2 = secondNumber;
        Long Mod = firstNumber % secondNumber;
        System.out.println("Mod of Digits =\t"+ Mod);
    }
    //Second Method
    public Long SecondModLongNumberUsingMethod(Long firstNumber, Long secondNumber) {
        Long num1 = firstNumber;
        Long num2 = secondNumber;
        Long Mod = firstNumber % secondNumber;
        return Mod;
    }
}

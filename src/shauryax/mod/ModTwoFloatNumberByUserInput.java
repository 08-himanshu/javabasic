package shauryax.mod;

import java.util.Scanner;

public class ModTwoFloatNumberByUserInput {
    public static void main(String[] args) {
        //Scaning Element
        Scanner scan = new Scanner(System.in);

        //Input Block
        System.out.print("Enter the first number\t");   //Input Comment
        float firstNumber = scan.nextInt();   //Scan Input
        System.out.print("Enter the second number\t");  //Input Comment
        float secondNumber = scan.nextInt();

        //Oprations
        float modOfNumbers = firstNumber % secondNumber;

        //Output Block
        System.out.println("Mod of those Two Digits =\t" + modOfNumbers);
    }
}
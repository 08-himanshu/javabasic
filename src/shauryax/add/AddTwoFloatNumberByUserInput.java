package shauryax.add;

import java.util.Scanner;

public class AddTwoFloatNumberByUserInput {
    public static void main(String[] args) {
        //Scaning Element
        Scanner scan = new Scanner(System.in);

        //Input Block
        System.out.print("Enter the first number\t");   //Input Comment
        float firstNumber = scan.nextInt();   //Scan Input
        System.out.print("Enter the second number\t");  //Input Comment
        float secondNumber = scan.nextInt();

        //Oprations
        float sumOfNumbers = firstNumber + secondNumber;

        //Output Block
        System.out.println("Sum of those Two Digits =\t" + sumOfNumbers);
    }
}
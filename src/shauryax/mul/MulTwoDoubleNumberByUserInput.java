package shauryax.mul;

import java.util.Scanner;

public class MulTwoDoubleNumberByUserInput {
    public static void main(String[] args) {
        //Scaning Element
        Scanner scan = new Scanner(System.in);

        //Input Block
        System.out.print("Enter the first number\t");   //Input Comment
        double firstNumber = scan.nextInt();   //Scan Input
        System.out.print("Enter the second number\t");  //Input Comment
        double secondNumber = scan.nextInt();

        //Oprations
        double mulOfNumbers = firstNumber * secondNumber;

        //Output Block
        System.out.println("Multiplication of those Two Digits =\t" + mulOfNumbers);
    }
}

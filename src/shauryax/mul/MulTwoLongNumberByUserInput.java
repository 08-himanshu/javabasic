package shauryax.mul;

import java.util.Scanner;

public class MulTwoLongNumberByUserInput {
    public static void main(String[] args) {
        //Scaning Element
        Scanner scan = new Scanner(System.in);

        //Input Block
        System.out.print("Enter the first number\t");   //Input Comment
        long firstNumber = scan.nextInt();   //Scan Input
        System.out.print("Enter the second number\t");  //Input Comment
        long secondNumber = scan.nextInt();

        //Oprations
        long mulOfNumbers = firstNumber * secondNumber;

        //Output Block
        System.out.println("Multiplication of those Two Digits =\t" + mulOfNumbers);
    }
}

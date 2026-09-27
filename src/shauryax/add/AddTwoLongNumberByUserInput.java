package shauryax.add;

import java.util.Scanner;

public class AddTwoLongNumberByUserInput {
    public static void main(String[] args) {
        //Scaning Element
        Scanner scan = new Scanner(System.in);

        //Input Block
        System.out.print("Enter the first number\t");   //Input Comment
        long firstNumber = scan.nextInt();   //Scan Input
        System.out.print("Enter the second number\t");  //Input Comment
        long secondNumber = scan.nextInt();

        //Oprations
        long sumOfNumbers = firstNumber + secondNumber;

        //Output Block
        System.out.println("Sum of those Two Digits =\t" + sumOfNumbers);
    }
}

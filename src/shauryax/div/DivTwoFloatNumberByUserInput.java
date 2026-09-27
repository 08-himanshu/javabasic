package shauryax.div;

import java.util.Scanner;

public class DivTwoFloatNumberByUserInput {
    public static void main(String[] args) {
        //Scaning Element
        Scanner scan = new Scanner(System.in);

        //Input Block
        System.out.print("Enter the first number\t");   //Input Comment
        float firstNumber = scan.nextInt();   //Scan Input
        System.out.print("Enter the second number\t");  //Input Comment
        float secondNumber = scan.nextInt();

        //Oprations
        float divOfNumbers = firstNumber / secondNumber;

        //Output Block
        System.out.println("Division of those Two Digits =\t" + divOfNumbers);
    }
}
package shauryax.div;

import java.util.Scanner;

public class DivTwoDoubleNumberByUserInput {
    public static void main(String[] args) {
        //Scaning Element
        Scanner scan = new Scanner(System.in);

        //Input Block
        System.out.print("Enter the first number\t");   //Input Comment
        double firstNumber = scan.nextInt();   //Scan Input
        System.out.print("Enter the second number\t");  //Input Comment
        double secondNumber = scan.nextInt();

        //Oprations
        double divOfNumbers = firstNumber / secondNumber;

        //Output Block
        System.out.println("Division of those Two Digits =\t" + divOfNumbers);
    }
}

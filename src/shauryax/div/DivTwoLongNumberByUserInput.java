package shauryax.div;

import java.util.Scanner;

public class DivTwoLongNumberByUserInput {
    public static void main(String[] args) {
        //Scaning Element
        Scanner scan = new Scanner(System.in);

        //Input Block
        System.out.print("Enter the first number\t");   //Input Comment
        long firstNumber = scan.nextInt();   //Scan Input
        System.out.print("Enter the second number\t");  //Input Comment
        long secondNumber = scan.nextInt();

        //Oprations
        long divOfNumbers = firstNumber / secondNumber;

        //Output Block
        System.out.println("Division of those Two Digits =\t" + divOfNumbers);
    }
}

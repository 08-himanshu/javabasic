package shauryax.sub;

import java.util.Scanner;

public class SubTwoLongNumberByUserInput {
    public static void main(String[] args) {
        //Scaning Element
        Scanner scan = new Scanner(System.in);

        //Input Block
        System.out.print("Enter the first number\t");   //Input Comment
        long firstNumber = scan.nextInt();   //Scan Input
        System.out.print("Enter the second number\t");  //Input Comment
        long secondNumber = scan.nextInt();

        //Oprations
        long subOfNumbers = firstNumber - secondNumber;

        //Output Block
        System.out.println("Sub of those Two Digits =\t" + subOfNumbers);
    }
}

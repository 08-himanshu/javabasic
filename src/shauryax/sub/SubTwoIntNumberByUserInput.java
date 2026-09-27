package shauryax.sub;

import java.util.Scanner;

public class SubTwoIntNumberByUserInput {
    public static void main(String[] args) {
        //Scaning Element
        Scanner scan = new Scanner(System.in);

        //Input Block
        System.out.print("Enter the first number\t");   //Input Comment
        int firstNumber = scan.nextInt();   //Scan Input
        System.out.print("Enter the second number\t");  //Input Comment
        int secondNumber = scan.nextInt();

        //Oprations
        int subOfNumbers = firstNumber - secondNumber;

        //Output Block
        System.out.println("Sub of those Two Digits =\t" + subOfNumbers);
    }
}

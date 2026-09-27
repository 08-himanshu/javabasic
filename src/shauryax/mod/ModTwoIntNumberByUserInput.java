package shauryax.mod;

import java.util.Scanner;

public class ModTwoIntNumberByUserInput {
    public static void main(String[] args) {
        //Scaning Element
        Scanner scan = new Scanner(System.in);

        //Input Block
        System.out.print("Enter the first number\t");   //Input Comment
        int firstNumber = scan.nextInt();   //Scan Input
        System.out.print("Enter the second number\t");  //Input Comment
        int secondNumber = scan.nextInt();

        //Oprations
        int modOfNumbers = firstNumber % secondNumber;

        //Output Block
        System.out.println("Mod of those Two Digits =\t" + modOfNumbers);
    }
}

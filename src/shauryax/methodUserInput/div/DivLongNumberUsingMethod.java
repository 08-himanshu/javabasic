package shauryax.methodUserInput.div;

import java.util.Scanner;

public class DivLongNumberUsingMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter you First Digit\t");
        Long firstNumber = scan.nextLong();
        System.out.print("Enter your Second Digit\t");
        Long secondNumber = scan.nextLong();
        //Create Object
        DivLongNumberUsingMethod DivLongTwoNumber = new DivLongNumberUsingMethod();
        //Method Call
        DivLongTwoNumber.FirstDivLongNumberUsingMethod(firstNumber, secondNumber);    //First Method
        //Store Method in Variable & Method Call
        Long div = DivLongTwoNumber.SecondDivLongNumberUsingMethod(firstNumber,secondNumber);  //Second Method
        System.out.println("Div of Digits =\t"+ div);
    }
    //First Method
    public void FirstDivLongNumberUsingMethod(Long firstNumber, Long secondNumber) {
        Long num1 = firstNumber;
        Long num2 = secondNumber;
        Long div = firstNumber / secondNumber;
        System.out.println("Div of Digits =\t"+ div);
    }
    //Second Method
    public Long SecondDivLongNumberUsingMethod(Long firstNumber, Long secondNumber) {
        Long num1 = firstNumber;
        Long num2 = secondNumber;
        Long div = firstNumber / secondNumber;
        return div;
    }
}

package shauryax.methodcallbyfile.add;

public class AddlongTwoNumberUsingMethod {

    //First Method
    public void FirstAddLongNumberUsingMethod() {
        long num1 = 625L;
        long num2 = 836L;
        long sum = num1 + num2;
        System.out.println("Sum of Digits =\t"+ sum);
    }
    //Second Method
    public void SecondAddLongNumberUsingMethod(long firstNumber, long secondNumber) {
        long num1 = firstNumber;
        long num2 = secondNumber;
        long sum = num1 + num2;
        System.out.println("Sum of Digits =\t"+ sum);
    }
    //Third Method
    public long ThirdAddLongNumberUsingMethod() {
        long num1 = 625L;
        long num2 = 836L;
        long sum = num1 + num2;
        return sum;
    }
    //Forth Method
    public long ForthAddLongNumberUsingMethod(long firstNumber, long secondNumber) {
        long num1 = firstNumber;
        long num2 = secondNumber;
        long sum = num1 + num2;
        return sum;
    }
}

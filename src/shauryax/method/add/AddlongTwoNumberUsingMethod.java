package shauryax.method.add;

public class AddlongTwoNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        AddlongTwoNumberUsingMethod AddLongTwoNumber = new AddlongTwoNumberUsingMethod();
        //Method Call
        AddLongTwoNumber.FirstAddLongNumberUsingMethod();    //First Method
        //Method Call
        AddLongTwoNumber.SecondAddLongNumberUsingMethod(736L, 542L);    //Second Method
        //Store Method in Variable & Method Call
        long third = AddLongTwoNumber.ThirdAddLongNumberUsingMethod();  //Third Method
        System.out.println("Sum of Digits =\t"+third);
        //Store Method in Variable & Method Call
        long forth = AddLongTwoNumber.ForthAddLongNumberUsingMethod(567L, 245L);  //Forth Method
        System.out.println("Sum of Digits =\t"+forth);
    }
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

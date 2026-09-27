package shauryax.methodcallbyfile.add;

public class AddIntegerTwoNumberUsingMethod {

    //First Method
    public void FirstAddIntegerNumberUsingMethod() {
        Integer num1 = 726;
        Integer num2 = 819;
        Integer sum = num1 + num2;
        System.out.println("Sum of Digits =\t"+ sum);
    }
    //Second Method
    public void SecondAddIntegerNumberUsingMethod(Integer firstNumber, Integer secondNumber) {
        Integer num1 = firstNumber;
        Integer num2 = secondNumber;
        Integer sum = firstNumber + secondNumber;
        System.out.println("Sum of Digits =\t"+ sum);
    }
    //Third Method
    public Integer ThirdAddIntNumberUsingMethod() {
        Integer num1 = 627;
        Integer num2 = 276;
        Integer sum = num1 + num2;
        return sum;
    }
    //Forth Method
    public Integer ForthAddIntNumberUsingMethod(Integer firstNumber, Integer secondNumber) {
        Integer num1 = firstNumber;
        Integer num2 = secondNumber;
        Integer sum = firstNumber + secondNumber;
        return sum;
    }
}
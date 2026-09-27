package shauryax.method.add;

public class AddIntegerTwoNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        AddIntegerTwoNumberUsingMethod AddIntegerTwoNumber = new AddIntegerTwoNumberUsingMethod();
        //Method Call
        AddIntegerTwoNumber.FirstAddIntegerNumberUsingMethod();    //First Method
        //Method Call
        AddIntegerTwoNumber.SecondAddIntegerNumberUsingMethod(634,738);    //Second Method
        //Store Method in Variable & Method Call
        Integer third = AddIntegerTwoNumber.ThirdAddIntNumberUsingMethod(); //Third Method
        System.out.println("Sum of Digits =\t"+ third);
        //Store Method in Variable & Method Call
        Integer forth = AddIntegerTwoNumber.ForthAddIntNumberUsingMethod(726, 928); //Forth Method
        System.out.println("Sum of Digits =\t"+ forth);
    }
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
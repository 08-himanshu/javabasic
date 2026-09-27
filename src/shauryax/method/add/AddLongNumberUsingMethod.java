package shauryax.method.add;

public class AddLongNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        AddLongNumberUsingMethod AddLongTwoNumber = new AddLongNumberUsingMethod();
        //Method Call
        AddLongTwoNumber.FirstAddLongNumberUsingMethod();    //First Method
        //Method Call
        AddLongTwoNumber.SecondAddLongNumberUsingMethod(827L, 726L);    //Second Method
        //Store Method in Variable & Method Call
        Long third = AddLongTwoNumber.ThirdAddLongNumberUsingMethod();  //Third Method
        System.out.println("Sum of Digits =\t"+ third);
        //Store Method in Variable & Method Call
        Long forth = AddLongTwoNumber.ForthAddLongNumberUsingMethod(635L, 536L);  //Forth Method
        System.out.println("Sum of Digits =\t"+ forth);
    }
    //First Method
    public void FirstAddLongNumberUsingMethod() {
        Long num1 = 376L;
        Long num2 = 837L;
        Long sum = num1 + num2;
        System.out.println("Sum of Digits =\t"+ sum);
    }
    //Second Method
    public void SecondAddLongNumberUsingMethod(Long firstNumber, Long secondNumber) {
        Long num1 = firstNumber;
        Long num2 = secondNumber;
        Long sum = num1 + num2;
        System.out.println("Sum of Digits =\t"+ sum);
    }
    //Third Method
    public Long ThirdAddLongNumberUsingMethod() {
        Long num1 = 736L;
        Long num2 = 736L;
        Long sum = num1 + num2;
        return sum;
    }
    //Forth Method
    public Long ForthAddLongNumberUsingMethod(Long firstNumber, Long secondNumber) {
        Long num1 = firstNumber;
        Long num2 = secondNumber;
        Long sum = num1 + num2;
        return sum;
    }
}

package shauryax.method.add;

public class AddIntTwoNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        AddIntTwoNumberUsingMethod AddIntTwoNumber = new AddIntTwoNumberUsingMethod();
        //Method Call
        AddIntTwoNumber.FirstAddIntNumberUsingMethod();    //First Method
        //Method Call
        AddIntTwoNumber.SecondAddIntNumberUsingMethod(827, 736);    //Second Method
        //Store Method in Variable & Method Call
        int third = AddIntTwoNumber.ThirdAddIntNumberUsingMethod();  //Third Method
        System.out.println("Sum of Digits =\t"+ third);
        int forth = AddIntTwoNumber.ForthAddIntNumberUsingMethod(736, 827);  //Forth Method
        System.out.println("Sum of Digits =\t"+ forth);
    }
    //First Method
    public void FirstAddIntNumberUsingMethod() {
        int num1 = 893;
        int num2 = 617;
        int sum = num1 + num2;
        System.out.println("Sum of Digits =\t"+ sum);
    }
    //Second Method
    public void SecondAddIntNumberUsingMethod(int firstNumber, int secondNumber) {
        int num1 = firstNumber;
        int num2 = secondNumber;
        int sum = num1 + num2;
        System.out.println("Sum of Digits =\t"+ sum);
    }
    //Third Method
    public int ThirdAddIntNumberUsingMethod() {
        int num1 = 2873;
        int num2 = 9273;
        int sum = num1 + num2;
        return sum;
    }
    //Forth Method
    public int ForthAddIntNumberUsingMethod(int firstNumber, int secondNumber) {
        int num1 = firstNumber;
        int num2 = secondNumber;
        int sum = num1 + num2;
        return sum;
    }
}

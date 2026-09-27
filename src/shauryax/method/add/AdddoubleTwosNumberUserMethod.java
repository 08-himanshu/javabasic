package shauryax.method.add;

public class AdddoubleTwosNumberUserMethod {
    public static void main(String[] args) {

        //Create Object
        AdddoubleTwosNumberUserMethod AddDoubleTypeNumber = new AdddoubleTwosNumberUserMethod();
        //Method Call
        AddDoubleTypeNumber.FirstAddDoubleTypeNumberUsingMethod();    //First Method
        //Method Call
        AddDoubleTypeNumber.SecondAddDoubleTypeNumberUsingMethod(8172d, 8273d);   //Second Method

        //Store Method in Variable & Method Call
        double third = AddDoubleTypeNumber.ThirdAddDoubleTypeNumberUsingMethod();   //Third Method
        System.out.println("The Sum is\t" + third);
        //Store Method in Variable & Method Call
        double forth = AddDoubleTypeNumber.ForthAddDoubleTypeNumberUsingMethod(8276d, 1726d);   //Forth Method
        System.out.println("The Sum is\t" + forth);
    }
    //First Method
    public void FirstAddDoubleTypeNumberUsingMethod() {
        double num1 = 7283d;
        double num2 = 8172d;
        double sum = num1 + num2;
        System.out.println("The Sum is\t" + sum);
    }
    //Second Method
    public void SecondAddDoubleTypeNumberUsingMethod(double firstNumber,double secondNumber) {
        double num1 = firstNumber;
        double num2 = secondNumber;
        double sum = num1 + num2;
        System.out.println("The Sum is\t" + sum);
    }
    //Third Method
    public double ThirdAddDoubleTypeNumberUsingMethod() {
        double num1 = 7263d;
        double num2 = 7625d;
        double sum = num1 + num2;
        return sum;
    }
    //Forth Method
    public double ForthAddDoubleTypeNumberUsingMethod(double firstNumber,double secondNumber) {
        double num1 = firstNumber;
        double num2 = secondNumber;
        double sum = num1 + num2;
        return sum;
    }
}
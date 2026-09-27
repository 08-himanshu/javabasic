package shauryax.methodcallbyfile.sub;

public class SubdoubleTwoNumberUsingMethod {

    //First Method
    public void FirstSubDoubleTypeNumberUsingMethod() {
        double num1 = 98D;
        double num2 = 61D;
        double sub = num1 - num2;
        System.out.println("The sub is\t" + sub);
    }
    //Second Method
    public void SecondSubDoubleTypeNumberUsingMethod(double firstNumber,double secondNumber) {
        double num1 = firstNumber;
        double num2 = secondNumber;
        double sub = num1 - num2;
        System.out.println("The sub is\t" + sub);
    }
    //Third Method
    public double ThirdSubDoubleTypeNumberUsingMethod() {
        double num1 = 62D;
        double num2 = 52D;
        double sub = num1 - num2;
        return sub;
    }
    //Forth Method
    public double ForthSubDoubleTypeNumberUsingMethod(double firstNumber,double secondNumber) {
        double num1 = firstNumber;
        double num2 = secondNumber;
        double sub = num1 - num2;
        return sub;
    }
}
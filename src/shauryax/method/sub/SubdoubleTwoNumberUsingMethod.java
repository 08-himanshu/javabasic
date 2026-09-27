package shauryax.method.sub;

public class SubdoubleTwoNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        SubdoubleTwoNumberUsingMethod SubDoubleTypeNumber = new SubdoubleTwoNumberUsingMethod();
        //Method Call
        SubDoubleTypeNumber.FirstSubDoubleTypeNumberUsingMethod();    //First Method
        //Method Call
        SubDoubleTypeNumber.SecondSubDoubleTypeNumberUsingMethod(53D, 82D);    //Second Method
        //Store Method in Variable & Method Call
        double third = SubDoubleTypeNumber.ThirdSubDoubleTypeNumberUsingMethod();   //Third Method
        System.out.println("The sub is\t" + third);
        //Store Method in Variable & Method Call
        double forth = SubDoubleTypeNumber.ForthSubDoubleTypeNumberUsingMethod(83D, 98D);   //Forth Method
        System.out.println("The sub is\t" + forth);
    }
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
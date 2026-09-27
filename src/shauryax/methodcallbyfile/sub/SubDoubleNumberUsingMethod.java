package shauryax.methodcallbyfile.sub;

public class SubDoubleNumberUsingMethod {

    //First Method
    public void FirstSubDoubleTypeNumberUsingMethod() {
        Double num1 = 98D;
        Double num2 = 61D;
        Double sub = num1 - num2;
        System.out.println("The sub is\t" + sub);
    }
    //Second Method
    public void SecondSubDoubleTypeNumberUsingMethod(Double firstNumber,Double secondNumber) {
        Double num1 = firstNumber;
        Double num2 = secondNumber;
        Double sub = num1 - num2;
        System.out.println("The sub is\t" + sub);
    }
    //Third Method
    public Double ThirdSubDoubleTypeNumberUsingMethod() {
        Double num1 = 62D;
        Double num2 = 52D;
        Double sub = num1 - num2;
        return sub;
    }
    //Forth Method
    public Double ForthSubDoubleTypeNumberUsingMethod(Double firstNumber,Double secondNumber) {
        Double num1 = firstNumber;
        Double num2 = secondNumber;
        Double sub = num1 - num2;
        return sub;
    }
}
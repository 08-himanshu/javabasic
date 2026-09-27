package shauryax.methodcallbyfile.sub;

public class SubFloatNumberUsingMethod {

    //First Method
    public void FirstSubFloatTypeNumberUsingMethod() {
        Float num1 = 98F;
        Float num2 = 61F;
        Float sub = num1 - num2;
        System.out.println("The sub is\t" + sub);
    }
    //Second Method
    public void SecondSubFloatTypeNumberUsingMethod(Float firstNumber,Float secondNumber) {
        Float num1 = firstNumber;
        Float num2 = secondNumber;
        Float sub = num1 - num2;
        System.out.println("The sub is\t" + sub);
    }
    //Third Method
    public Float ThirdSubFloatTypeNumberUsingMethod() {
        Float num1 = 62F;
        Float num2 = 52F;
        Float sub = num1 - num2;
        return sub;
    }
    //Forth Method
    public Float ForthSubFloatTypeNumberUsingMethod(Float firstNumber,Float secondNumber) {
        Float num1 = firstNumber;
        Float num2 = secondNumber;
        Float sub = num1 - num2;
        return sub;
    }
}
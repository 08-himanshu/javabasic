package shauryax.method.sub;

public class SubIntegerTwoNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        SubIntegerTwoNumberUsingMethod SubIntegerTypeNumber = new SubIntegerTwoNumberUsingMethod();
        //Method Call
        SubIntegerTypeNumber.FirstSubIntegerTypeNumberUsingMethod();    //First Method
        //Method Call
        SubIntegerTypeNumber.SecondSubIntegerTypeNumberUsingMethod(53, 82);    //Second Method
        //Store Method in Variable & Method Call
        Integer third = SubIntegerTypeNumber.ThirdSubIntegerTypeNumberUsingMethod();   //Third Method
        System.out.println("The sub is\t" + third);
        //Store Method in Variable & Method Call
        Integer forth = SubIntegerTypeNumber.ForthSubIntegerTypeNumberUsingMethod(83, 98);   //Forth Method
        System.out.println("The sub is\t" + forth);
    }
    //First Method
    public void FirstSubIntegerTypeNumberUsingMethod() {
        Integer num1 = 98;
        Integer num2 = 61;
        Integer sub = num1 - num2;
        System.out.println("The sub is\t" + sub);
    }
    //Second Method
    public void SecondSubIntegerTypeNumberUsingMethod(Integer firstNumber,Integer secondNumber) {
        Integer num1 = firstNumber;
        Integer num2 = secondNumber;
        Integer sub = num1 - num2;
        System.out.println("The sub is\t" + sub);
    }
    //Third Method
    public Integer ThirdSubIntegerTypeNumberUsingMethod() {
        Integer num1 = 62;
        Integer num2 = 52;
        Integer sub = num1 - num2;
        return sub;
    }
    //Forth Method
    public Integer ForthSubIntegerTypeNumberUsingMethod(Integer firstNumber,Integer secondNumber) {
        Integer num1 = firstNumber;
        Integer num2 = secondNumber;
        Integer sub = num1 - num2;
        return sub;
    }
}
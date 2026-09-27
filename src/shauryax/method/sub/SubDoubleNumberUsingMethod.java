package shauryax.method.sub;

public class SubDoubleNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        SubDoubleNumberUsingMethod SubDoubleTypeNumber = new SubDoubleNumberUsingMethod();
        //Method Call
        SubDoubleTypeNumber.FirstSubDoubleTypeNumberUsingMethod();    //First Method
        //Method Call
        SubDoubleTypeNumber.SecondSubDoubleTypeNumberUsingMethod(53D, 82D);    //Second Method
        //Store Method in Variable & Method Call
        Double third = SubDoubleTypeNumber.ThirdSubDoubleTypeNumberUsingMethod();   //Third Method
        System.out.println("The sub is\t" + third);
        //Store Method in Variable & Method Call
        Double forth = SubDoubleTypeNumber.ForthSubDoubleTypeNumberUsingMethod(83D, 98D);   //Forth Method
        System.out.println("The sub is\t" + forth);
    }
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
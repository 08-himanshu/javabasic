package shauryax.method.sub;

public class SubfloatTwoNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        SubfloatTwoNumberUsingMethod SubDoubleTypeNumber = new SubfloatTwoNumberUsingMethod();
        //Method Call
        SubDoubleTypeNumber.FirstSubDoubleTypeNumberUsingMethod();    //First Method
        //Method Call
        SubDoubleTypeNumber.SecondSubDoubleTypeNumberUsingMethod(53f, 82f);    //Second Method
        //Store Method in Variable & Method Call
        float third = SubDoubleTypeNumber.ThirdSubDoubleTypeNumberUsingMethod();   //Third Method
        System.out.println("The sub is\t" + third);
        //Store Method in Variable & Method Call
        float forth = SubDoubleTypeNumber.ForthSubDoubleTypeNumberUsingMethod(83f, 98f);   //Forth Method
        System.out.println("The sub is\t" + forth);
    }
    //First Method
    public void FirstSubDoubleTypeNumberUsingMethod() {
        float num1 = 98f;
        float num2 = 61f;
        float sub = num1 - num2;
        System.out.println("The sub is\t" + sub);
    }
    //Second Method
    public void SecondSubDoubleTypeNumberUsingMethod(float firstNumber,float secondNumber) {
        float num1 = firstNumber;
        float num2 = secondNumber;
        float sub = num1 - num2;
        System.out.println("The sub is\t" + sub);
    }
    //Third Method
    public float ThirdSubDoubleTypeNumberUsingMethod() {
        float num1 = 62f;
        float num2 = 52f;
        float sub = num1 - num2;
        return sub;
    }
    //Forth Method
    public float ForthSubDoubleTypeNumberUsingMethod(float firstNumber,float secondNumber) {
        float num1 = firstNumber;
        float num2 = secondNumber;
        float sub = num1 - num2;
        return sub;
    }
}
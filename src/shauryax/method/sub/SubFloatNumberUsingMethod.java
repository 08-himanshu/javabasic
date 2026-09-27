package shauryax.method.sub;

public class SubFloatNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        SubFloatNumberUsingMethod SubFloatTypeNumber = new SubFloatNumberUsingMethod();
        //Method Call
        SubFloatTypeNumber.FirstSubFloatTypeNumberUsingMethod();    //First Method
        //Method Call
        SubFloatTypeNumber.SecondSubFloatTypeNumberUsingMethod(53F, 82F);    //Second Method
        //Store Method in Variable & Method Call
        Float third = SubFloatTypeNumber.ThirdSubFloatTypeNumberUsingMethod();   //Third Method
        System.out.println("The sub is\t" + third);
        //Store Method in Variable & Method Call
        Float forth = SubFloatTypeNumber.ForthSubFloatTypeNumberUsingMethod(83F, 98F);   //Forth Method
        System.out.println("The sub is\t" + forth);
    }
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
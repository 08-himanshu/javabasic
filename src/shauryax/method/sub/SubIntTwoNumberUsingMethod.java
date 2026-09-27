package shauryax.method.sub;

public class SubIntTwoNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        SubIntTwoNumberUsingMethod SubIntTypeNumber = new SubIntTwoNumberUsingMethod();
        //Method Call
        SubIntTypeNumber.FirstSubIntTypeNumberUsingMethod();    //First Method
        //Method Call
        SubIntTypeNumber.SecondSubIntTypeNumberUsingMethod(53, 82);    //Second Method
        //Store Method in Variable & Method Call
        int third = SubIntTypeNumber.ThirdSubIntTypeNumberUsingMethod();   //Third Method
        System.out.println("The sub is\t" + third);
        //Store Method in Variable & Method Call
        int forth = SubIntTypeNumber.ForthSubIntTypeNumberUsingMethod(83, 98);   //Forth Method
        System.out.println("The sub is\t" + forth);
    }
    //First Method
    public void FirstSubIntTypeNumberUsingMethod() {
        int num1 = 98;
        int num2 = 61;
        int sub = num1 - num2;
        System.out.println("The sub is\t" + sub);
    }
    //Second Method
    public void SecondSubIntTypeNumberUsingMethod(int firstNumber,int secondNumber) {
        int num1 = firstNumber;
        int num2 = secondNumber;
        int sub = num1 - num2;
        System.out.println("The sub is\t" + sub);
    }
    //Third Method
    public int ThirdSubIntTypeNumberUsingMethod() {
        int num1 = 62;
        int num2 = 52;
        int sub = num1 - num2;
        return sub;
    }
    //Forth Method
    public int ForthSubIntTypeNumberUsingMethod(int firstNumber,int secondNumber) {
        int num1 = firstNumber;
        int num2 = secondNumber;
        int sub = num1 - num2;
        return sub;
    }
}

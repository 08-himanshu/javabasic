package shauryax.method.sub;

public class SublongTwoNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        SublongTwoNumberUsingMethod SubLongTypeNumber = new SublongTwoNumberUsingMethod();
        //Method Call
        SubLongTypeNumber.FirstSubLongTypeNumberUsingMethod();    //First Method
        //Method Call
        SubLongTypeNumber.SecondSubLongTypeNumberUsingMethod(53, 82);    //Second Method
        //Store Method in Variable & Method Call
        long third = SubLongTypeNumber.ThirdSubLongTypeNumberUsingMethod();   //Third Method
        System.out.println("The sub is\t" + third);
        //Store Method in Variable & Method Call
        long forth = SubLongTypeNumber.ForthSubLongTypeNumberUsingMethod(83, 98);   //Forth Method
        System.out.println("The sub is\t" + forth);
    }
    //First Method
    public void FirstSubLongTypeNumberUsingMethod() {
        long num1 = 98;
        long num2 = 61;
        long sub = num1 - num2;
        System.out.println("The sub is\t" + sub);
    }
    //Second Method
    public void SecondSubLongTypeNumberUsingMethod(long firstNumber,long secondNumber) {
        long num1 = firstNumber;
        long num2 = secondNumber;
        long sub = num1 - num2;
        System.out.println("The sub is\t" + sub);
    }
    //Third Method
    public long ThirdSubLongTypeNumberUsingMethod() {
        long num1 = 62;
        long num2 = 52;
        long sub = num1 - num2;
        return sub;
    }
    //Forth Method
    public long ForthSubLongTypeNumberUsingMethod(long firstNumber,long secondNumber) {
        long num1 = firstNumber;
        long num2 = secondNumber;
        long sub = num1 - num2;
        return sub;
    }
}

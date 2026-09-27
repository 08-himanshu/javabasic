package shauryax.method.sub;

public class SubLongNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        SubLongNumberUsingMethod SubLongTypeNumber = new SubLongNumberUsingMethod();
        //Method Call
        SubLongTypeNumber.FirstSubLongTypeNumberUsingMethod();    //First Method
        //Method Call
        SubLongTypeNumber.SecondSubLongTypeNumberUsingMethod(53L, 82L);    //Second Method
        //Store Method in Variable & Method Call
        Long third = SubLongTypeNumber.ThirdSubLongTypeNumberUsingMethod();   //Third Method
        System.out.println("The sub is\t" + third);
        //Store Method in Variable & Method Call
        Long forth = SubLongTypeNumber.ForthSubLongTypeNumberUsingMethod(83L, 98L);   //Forth Method
        System.out.println("The sub is\t" + forth);
    }
    //First Method
    public void FirstSubLongTypeNumberUsingMethod() {
        Long num1 = 98L;
        Long num2 = 61L;
        Long sub = num1 - num2;
        System.out.println("The sub is\t" + sub);
    }
    //Second Method
    public void SecondSubLongTypeNumberUsingMethod(Long firstNumber,Long secondNumber) {
        Long num1 = firstNumber;
        Long num2 = secondNumber;
        Long sub = num1 - num2;
        System.out.println("The sub is\t" + sub);
    }
    //Third Method
    public Long ThirdSubLongTypeNumberUsingMethod() {
        Long num1 = 62L;
        Long num2 = 52L;
        Long sub = num1 - num2;
        return sub;
    }
    //Forth Method
    public Long ForthSubLongTypeNumberUsingMethod(Long firstNumber,Long secondNumber) {
        Long num1 = firstNumber;
        Long num2 = secondNumber;
        Long sub = num1 - num2;
        return sub;
    }
}

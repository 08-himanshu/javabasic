package shauryax.methodcallbyfile.sub;

public class SubLongNumberUsingMethod {

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

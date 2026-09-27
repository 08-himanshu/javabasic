package shauryax.methodcallbyfile.mod;

public class ModDoubleNumberUsingMethod {

    //First Method
    public void FirstModDoubleTypeNumberUsingMethod() {
        Double num1 = 873D;
        Double num2 = 763D;
        Double Mod = num1 % num2;
        System.out.println("The Mod is\t" + Mod);
    }
    //Second Method
    public void SecondModDoubleTypeNumberUsingMethod(Double firstNumber,Double secondNumber) {
        Double num1 = firstNumber;
        Double num2 = secondNumber;
        Double Mod = num1 % num2;
        System.out.println("The Mod is\t" + Mod);
    }
    //Third Method
    public Double ThirdModDoubleTypeNumberUsingMethod() {
        Double num1 = 819D;
        Double num2 = 542D;
        Double Mod = num1 % num2;
        return Mod;
    }
    //Forth Method
    public Double ForthModDoubleTypeNumberUsingMethod(Double firstNumber,Double secondNumber) {
        Double num1 = firstNumber;
        Double num2 = secondNumber;
        Double Mod = num1 % num2;
        return Mod;
    }
}
package shauryax.methodcallbyfile.add;

public class AddDoubleNumberUsingMethod {

    //First Method
    public void FirstAddDoubleTypeNumberUsingMethod() {
        Double num1 = 4545D;
        Double num2 = 4545D;
        Double sum = num1 + num2;
        System.out.println("The Sum is\t" + sum);
    }
    //Second Method
    public void SecondAddDoubleTypeNumberUsingMethod(Double firstNumber,Double secondNumber) {
        Double num1 = firstNumber;
        Double num2 = secondNumber;
        Double sum = num1 + num2;
        System.out.println("The Sum is\t" + sum);
    }
    //Third Method
    public Double ThirdAddDoubleTypeNumberUsingMethod() {
        Double num1 = 6655D;
        Double num2 = 6655D;
        Double sum = num1 + num2;
        return sum;
    }
    //Forth Method
    public Double ForthAddDoubleTypeNumberUsingMethod(Double firstNumber, Double secondNumber) {
        Double num1 = firstNumber;
        Double num2 = secondNumber;
        Double sum = num1 + num2;
        return sum;
    }
}
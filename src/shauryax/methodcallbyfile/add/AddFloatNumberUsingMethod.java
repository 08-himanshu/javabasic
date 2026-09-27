package shauryax.methodcallbyfile.add;

public class AddFloatNumberUsingMethod {

    //First Method
    public void FirstAddFloatTypeNumberUsingMethod(){
        Float num1 = 345F;
        Float num2 = 827F;
        Float sum = num1 + num2;
        System.out.println("The Sum is\t" + sum);
    }
    //Second Method
    public void SecondAddFloatTypeNumberUsingMethod(Float firstNumber,Float secondNumber){
        Float num1 = firstNumber;
        Float num2 = secondNumber;
        Float sum = num1 + num2;
        System.out.println("The Sum is\t" + sum);
    }
    //Third Method
    public Float ThirdAddFloatTypeNumberUsingMethod() {
        Float num3 = 928F;
        Float num4 = 826F;
        Float sum = num3 + num4;
        return sum;
    }
    //Forth Method
    public Float ForthAddFloatTypeNumberUsingMethod(Float firstNumber,Float secondNumber) {
        Float num3 = firstNumber;
        Float num4 = secondNumber;
        Float sum = num3 + num4;
        return sum;
    }
}
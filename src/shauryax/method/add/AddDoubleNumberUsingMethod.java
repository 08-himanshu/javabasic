package shauryax.method.add;

public class AddDoubleNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        AddDoubleNumberUsingMethod AddDoubleTypeNumber = new AddDoubleNumberUsingMethod();
        //Method Call
        AddDoubleTypeNumber.FirstAddDoubleTypeNumberUsingMethod();    //First Method
        //Method Call
        AddDoubleTypeNumber.SecondAddDoubleTypeNumberUsingMethod(4735D, 6354D);   //Second Method
        //Store Method in Variable & Method Call
        Double third = AddDoubleTypeNumber.ThirdAddDoubleTypeNumberUsingMethod();   //Third Method
        System.out.println("The Sum is\t" + third);
        //Store Method in Variable & Method Call
        Double forth = AddDoubleTypeNumber.ForthAddDoubleTypeNumberUsingMethod(5253D, 5248D);   //Forth Method
        System.out.println("The Sum is\t" + forth);
    }
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
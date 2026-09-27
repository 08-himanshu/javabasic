package shauryax.method.div;

public class DivdoubleTwoNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        DivdoubleTwoNumberUsingMethod DivdoubleTypeNumber = new DivdoubleTwoNumberUsingMethod();
        //Method Call
        DivdoubleTypeNumber.FirstDivdoubleTypeNumberUsingMethod();    //First Method
        //Method Call
        DivdoubleTypeNumber.SecondDivdoubleTypeNumberUsingMethod(364d, 635d);    //Second Method
        //Store Method in Variable & Method Call
        double third = DivdoubleTypeNumber.ThirdDivdoubleTypeNumberUsingMethod();   //Third Method
        System.out.println("The Div is\t" + third);
        //Store Method in Variable & Method Call
        double forth = DivdoubleTypeNumber.ForthDivdoubleTypeNumberUsingMethod(695d, 618d );   //Forth Method
        System.out.println("The Div is\t" + forth);
    }
    //First Method
    public void FirstDivdoubleTypeNumberUsingMethod() {
        double num1 = 8374d;
        double num2 = 7304d;
        double div = num1 / num2;
        System.out.println("The Div is\t" + div);
    }
    //Second Method
    public void SecondDivdoubleTypeNumberUsingMethod(double firstNumber,double secondNumber) {
        double num1 = firstNumber;
        double num2 = secondNumber;
        double div = num1 / num2;
        System.out.println("The Div is\t" + div);
    }
    //Third Method
    public double ThirdDivdoubleTypeNumberUsingMethod() {
        double num1 = 7364d;
        double num2 = 5463d;
        double div = num1 / num2;
        return div;
    }
    //Forth Method
    public double ForthDivdoubleTypeNumberUsingMethod(double firstNumber,double secondNumber) {
        double num1 = firstNumber;
        double num2 = secondNumber;
        double div = num1 / num2;
        return div;
    }
}
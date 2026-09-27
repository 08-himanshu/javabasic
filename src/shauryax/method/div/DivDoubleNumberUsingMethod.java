package shauryax.method.div;

public class DivDoubleNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        DivDoubleNumberUsingMethod DivDoubleTypeNumber = new DivDoubleNumberUsingMethod();
        //Method Call
        DivDoubleTypeNumber.FirstDivDoubleTypeNumberUsingMethod();    //First Method
        //Method Call
        DivDoubleTypeNumber.SecondDivDoubleTypeNumberUsingMethod(763D, 926D);    //Second Method
        //Store Method in Variable & Method Call
        Double third = DivDoubleTypeNumber.ThirdDivDoubleTypeNumberUsingMethod();   //Third Method
        System.out.println("The Div is\t" + third);
        //Store Method in Variable & Method Call
        Double forth = DivDoubleTypeNumber.ForthDivDoubleTypeNumberUsingMethod(265D, 726D);   //Forth Method
        System.out.println("The Div is\t" + forth);
    }
    //First Method
    public void FirstDivDoubleTypeNumberUsingMethod() {
        Double num1 = 8374D;
        Double num2 = 7304D;
        Double div = num1 / num2;
        System.out.println("The Div is\t" + div);
    }
    //Second Method
    public void SecondDivDoubleTypeNumberUsingMethod(Double firstNumber,Double secondNumber) {
        Double num1 = firstNumber;
        Double num2 = secondNumber;
        Double div = num1 / num2;
        System.out.println("The Div is\t" + div);
    }
    //Third Method
    public Double ThirdDivDoubleTypeNumberUsingMethod() {
        Double num1 = 7364D;
        Double num2 = 5463D;
        Double div = num1 / num2;
        return div;
    }
    //Forth Method
    public Double ForthDivDoubleTypeNumberUsingMethod(Double firstNumber,Double secondNumber) {
        Double num1 = firstNumber;
        Double num2 = secondNumber;
        Double div = num1 / num2;
        return div;
    }
}
package shauryax.method.div;

public class DivIntegerTwoNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        DivIntegerTwoNumberUsingMethod DivIntegerTypeNumber = new DivIntegerTwoNumberUsingMethod();
        //Method Call
        DivIntegerTypeNumber.FirstDivIntegerTypeNumberUsingMethod();    //First Method
        //Method Call
        DivIntegerTypeNumber.SecondDivIntegerTypeNumberUsingMethod(364, 635);    //Second Method
        //Store Method in Variable & Method Call
        Integer third = DivIntegerTypeNumber.ThirdDivIntegerTypeNumberUsingMethod();   //Third Method
        System.out.println("The Div is\t" + third);
        //Store Method in Variable & Method Call
        Integer forth = DivIntegerTypeNumber.ForthDivIntegerTypeNumberUsingMethod(695, 618);   //Forth Method
        System.out.println("The Div is\t" + forth);
    }
    //First Method
    public void FirstDivIntegerTypeNumberUsingMethod() {
        Integer num1 = 874;
        Integer num2 = 704;
        Integer div = num1 / num2;
        System.out.println("The Div is\t" + div);
    }
    //Second Method
    public void SecondDivIntegerTypeNumberUsingMethod(Integer firstNumber,Integer secondNumber) {
        Integer num1 = firstNumber;
        Integer num2 = secondNumber;
        Integer div = num1 / num2;
        System.out.println("The Div is\t" + div);
    }
    //Third Method
    public Integer ThirdDivIntegerTypeNumberUsingMethod() {
        Integer num1 = 734;
        Integer num2 = 563;
        Integer div = num1 / num2;
        return div;
    }
    //Forth Method
    public Integer ForthDivIntegerTypeNumberUsingMethod(Integer firstNumber,Integer secondNumber) {
        Integer num1 = firstNumber;
        Integer num2 = secondNumber;
        Integer div = num1 / num2;
        return div;
    }
}
package shauryax.method.div;


public class DivFloatNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        DivFloatNumberUsingMethod DivFloatTypeNumber = new DivFloatNumberUsingMethod();
        //Method Call
        DivFloatTypeNumber.FirstDivFloatTypeNumberUsingMethod();    //First Method
        //Method Call
        DivFloatTypeNumber.SecondDivFloatTypeNumberUsingMethod(364F, 635F);    //Second Method
        //Store Method in Variable & Method Call
        Float third = DivFloatTypeNumber.ThirdDivFloatTypeNumberUsingMethod();   //Third Method
        System.out.println("The Div is\t" + third);
        //Store Method in Variable & Method Call
        Float forth = DivFloatTypeNumber.ForthDivFloatTypeNumberUsingMethod(695F, 618F);   //Forth Method
        System.out.println("The Div is\t" + forth);
    }
    //First Method
    public void FirstDivFloatTypeNumberUsingMethod() {
        Float num1 = 874F;
        Float num2 = 704F;
        Float div = num1 / num2;
        System.out.println("The Div is\t" + div);
    }
    //Second Method
    public void SecondDivFloatTypeNumberUsingMethod(Float firstNumber,Float secondNumber) {
        Float num1 = firstNumber;
        Float num2 = secondNumber;
        Float div = num1 / num2;
        System.out.println("The Div is\t" + div);
    }
    //Third Method
    public Float ThirdDivFloatTypeNumberUsingMethod() {
        Float num1 = 734F;
        Float num2 = 563F;
        Float div = num1 / num2;
        return div;
    }
    //Forth Method
    public Float ForthDivFloatTypeNumberUsingMethod(Float firstNumber,Float secondNumber) {
        Float num1 = firstNumber;
        Float num2 = secondNumber;
        Float div = num1 / num2;
        return div;
    }
}
package shauryax.method.div;

public class DivfloatTwoNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        DivfloatTwoNumberUsingMethod DivfloatTypeNumber = new DivfloatTwoNumberUsingMethod();
        //Method Call
        DivfloatTypeNumber.FirstDivfloatTypeNumberUsingMethod();    //First Method
        //Method Call
        DivfloatTypeNumber.SecondDivfloatTypeNumberUsingMethod(364f, 635f);    //Second Method
        //Store Method in Variable & Method Call
        float third = DivfloatTypeNumber.ThirdDivfloatTypeNumberUsingMethod();   //Third Method
        System.out.println("The Div is\t" + third);
        //Store Method in Variable & Method Call
        float forth = DivfloatTypeNumber.ForthDivfloatTypeNumberUsingMethod(695f, 618f);   //Forth Method
        System.out.println("The Div is\t" + forth);
    }
    //First Method
    public void FirstDivfloatTypeNumberUsingMethod() {
        float num1 = 874f;
        float num2 = 704f;
        float div = num1 / num2;
        System.out.println("The Div is\t" + div);
    }
    //Second Method
    public void SecondDivfloatTypeNumberUsingMethod(float firstNumber,float secondNumber) {
        float num1 = firstNumber;
        float num2 = secondNumber;
        float div = num1 / num2;
        System.out.println("The Div is\t" + div);
    }
    //Third Method
    public float ThirdDivfloatTypeNumberUsingMethod() {
        float num1 = 734f;
        float num2 = 563f;
        float div = num1 / num2;
        return div;
    }
    //Forth Method
    public float ForthDivfloatTypeNumberUsingMethod(float firstNumber,float secondNumber) {
        float num1 = firstNumber;
        float num2 = secondNumber;
        float div = num1 / num2;
        return div;
    }
}
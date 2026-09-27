package shauryax.method.div;

public class DivIntTwoNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        DivIntTwoNumberUsingMethod DivintTypeNumber = new DivIntTwoNumberUsingMethod();
        //Method Call
        DivintTypeNumber.FirstDivintTypeNumberUsingMethod();    //First Method
        //Method Call
        DivintTypeNumber.SecondDivintTypeNumberUsingMethod(364, 635);    //Second Method
        //Store Method in Variable & Method Call
        int third = DivintTypeNumber.ThirdDivintTypeNumberUsingMethod();   //Third Method
        System.out.println("The Div is\t" + third);
        //Store Method in Variable & Method Call
        int forth = DivintTypeNumber.ForthDivintTypeNumberUsingMethod(695, 618);   //Forth Method
        System.out.println("The Div is\t" + forth);
    }
    //First Method
    public void FirstDivintTypeNumberUsingMethod() {
        int num1 = 874;
        int num2 = 704;
        int div = num1 / num2;
        System.out.println("The Div is\t" + div);
    }
    //Second Method
    public void SecondDivintTypeNumberUsingMethod(int firstNumber,int secondNumber) {
        int num1 = firstNumber;
        int num2 = secondNumber;
        int div = num1 / num2;
        System.out.println("The Div is\t" + div);
    }
    //Third Method
    public int ThirdDivintTypeNumberUsingMethod() {
        int num1 = 734;
        int num2 = 563;
        int div = num1 / num2;
        return div;
    }
    //Forth Method
    public int ForthDivintTypeNumberUsingMethod(int firstNumber,int secondNumber) {
        int num1 = firstNumber;
        int num2 = secondNumber;
        int div = num1 / num2;
        return div;
    }
}

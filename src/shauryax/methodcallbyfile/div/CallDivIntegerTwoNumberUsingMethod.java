package shauryax.methodcallbyfile.div;

public class CallDivIntegerTwoNumberUsingMethod {
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
}

package shauryax.methodcallbyfile.div;

public class CallDivFloatNumberUsingMethod {
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
}

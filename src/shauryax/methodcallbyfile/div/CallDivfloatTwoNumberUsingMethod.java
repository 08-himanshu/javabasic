package shauryax.methodcallbyfile.div;

public class CallDivfloatTwoNumberUsingMethod {
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
}

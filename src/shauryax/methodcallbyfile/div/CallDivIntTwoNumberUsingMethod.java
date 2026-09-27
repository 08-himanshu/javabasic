package shauryax.methodcallbyfile.div;

public class CallDivIntTwoNumberUsingMethod {
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
}

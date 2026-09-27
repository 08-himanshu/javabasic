package shauryax.methodcallbyfile.div;

public class CallDivLongNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        DivLongNumberUsingMethod DivLongTypeNumber = new DivLongNumberUsingMethod();
        //Method Call
        DivLongTypeNumber.FirstDivLongTypeNumberUsingMethod();    //First Method
        //Method Call
        DivLongTypeNumber.SecondDivLongTypeNumberUsingMethod(364L, 635L);    //Second Method
        //Store Method in Variable & Method Call
        Long third = DivLongTypeNumber.ThirdDivLongTypeNumberUsingMethod();   //Third Method
        System.out.println("The Div is\t" + third);
        //Store Method in Variable & Method Call
        Long forth = DivLongTypeNumber.ForthDivLongTypeNumberUsingMethod(695L, 618L);   //Forth Method
        System.out.println("The Div is\t" + forth);
    }
}

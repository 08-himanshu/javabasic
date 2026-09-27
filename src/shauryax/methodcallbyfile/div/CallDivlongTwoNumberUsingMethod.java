package shauryax.methodcallbyfile.div;

public class CallDivlongTwoNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        DivlongTwoNumberUsingMethod DivlongTypeNumber = new DivlongTwoNumberUsingMethod();
        //Method Call
        DivlongTypeNumber.FirstDivlongTypeNumberUsingMethod();    //First Method
        //Method Call
        DivlongTypeNumber.SecondDivlongTypeNumberUsingMethod(364l, 635l);    //Second Method
        //Store Method in Variable & Method Call
        long third = DivlongTypeNumber.ThirdDivlongTypeNumberUsingMethod();   //Third Method
        System.out.println("The Div is\t" + third);
        //Store Method in Variable & Method Call
        long forth = DivlongTypeNumber.ForthDivlongTypeNumberUsingMethod(695l, 618l);   //Forth Method
        System.out.println("The Div is\t" + forth);
    }
}

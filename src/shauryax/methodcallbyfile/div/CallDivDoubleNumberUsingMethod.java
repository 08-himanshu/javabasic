package shauryax.methodcallbyfile.div;

public class CallDivDoubleNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        DivDoubleNumberUsingMethod DivDoubleTypeNumber = new DivDoubleNumberUsingMethod();
        //Method Call
        DivDoubleTypeNumber.FirstDivDoubleTypeNumberUsingMethod();    //First Method
        //Method Call
        DivDoubleTypeNumber.SecondDivDoubleTypeNumberUsingMethod(763D, 926D);    //Second Method
        //Store Method in Variable & Method Call
        Double third = DivDoubleTypeNumber.ThirdDivDoubleTypeNumberUsingMethod();   //Third Method
        System.out.println("The Div is\t" + third);
        //Store Method in Variable & Method Call
        Double forth = DivDoubleTypeNumber.ForthDivDoubleTypeNumberUsingMethod(265D, 726D);   //Forth Method
        System.out.println("The Div is\t" + forth);
    }
}

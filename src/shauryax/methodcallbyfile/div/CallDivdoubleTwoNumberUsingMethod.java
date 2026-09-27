package shauryax.methodcallbyfile.div;

public class CallDivdoubleTwoNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        DivdoubleTwoNumberUsingMethod DivdoubleTypeNumber = new DivdoubleTwoNumberUsingMethod();
        //Method Call
        DivdoubleTypeNumber.FirstDivdoubleTypeNumberUsingMethod();    //First Method
        //Method Call
        DivdoubleTypeNumber.SecondDivdoubleTypeNumberUsingMethod(364d, 635d);    //Second Method
        //Store Method in Variable & Method Call
        double third = DivdoubleTypeNumber.ThirdDivdoubleTypeNumberUsingMethod();   //Third Method
        System.out.println("The Div is\t" + third);
        //Store Method in Variable & Method Call
        double forth = DivdoubleTypeNumber.ForthDivdoubleTypeNumberUsingMethod(695d, 618d );   //Forth Method
        System.out.println("The Div is\t" + forth);
    }
}

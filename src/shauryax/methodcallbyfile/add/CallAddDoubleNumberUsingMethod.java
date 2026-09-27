package shauryax.methodcallbyfile.add;

public class CallAddDoubleNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        AddDoubleNumberUsingMethod AddDoubleTypeNumber = new AddDoubleNumberUsingMethod();
        //Method Call
        AddDoubleTypeNumber.FirstAddDoubleTypeNumberUsingMethod();    //First Method
        //Method Call
        AddDoubleTypeNumber.SecondAddDoubleTypeNumberUsingMethod(4735D, 6354D);   //Second Method
        //Store Method in Variable & Method Call
        Double third = AddDoubleTypeNumber.ThirdAddDoubleTypeNumberUsingMethod();   //Third Method
        System.out.println("The Sum is\t" + third);
        //Store Method in Variable & Method Call
        Double forth = AddDoubleTypeNumber.ForthAddDoubleTypeNumberUsingMethod(5253D, 5248D);   //Forth Method
        System.out.println("The Sum is\t" + forth);
    }
}

package shauryax.methodcallbyfile.add;

public class CallAdddoubleTwosNumberUserMethod {
    public static void main(String[] args) {

        //Create Object
        AdddoubleTwosNumberUserMethod AddDoubleTypeNumber = new AdddoubleTwosNumberUserMethod();
        //Method Call
        AddDoubleTypeNumber.FirstAddDoubleTypeNumberUsingMethod();    //First Method
        //Method Call
        AddDoubleTypeNumber.SecondAddDoubleTypeNumberUsingMethod(8172d, 8273d);   //Second Method

        //Store Method in Variable & Method Call
        double third = AddDoubleTypeNumber.ThirdAddDoubleTypeNumberUsingMethod();   //Third Method
        System.out.println("The Sum is\t" + third);
        //Store Method in Variable & Method Call
        double forth = AddDoubleTypeNumber.ForthAddDoubleTypeNumberUsingMethod(8276d, 1726d);   //Forth Method
        System.out.println("The Sum is\t" + forth);
    }
}

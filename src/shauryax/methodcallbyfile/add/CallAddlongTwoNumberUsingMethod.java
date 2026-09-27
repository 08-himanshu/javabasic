package shauryax.methodcallbyfile.add;

public class CallAddlongTwoNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        AddlongTwoNumberUsingMethod AddlongTwoNumber = new AddlongTwoNumberUsingMethod();
        //Method Call
        AddlongTwoNumber.FirstAddLongNumberUsingMethod();    //First Method
        //Method Call
        AddlongTwoNumber.SecondAddLongNumberUsingMethod(726L, 834L);    //Second Method
        //Store Method in Variable & Method Call
        long third = AddlongTwoNumber.ThirdAddLongNumberUsingMethod();  //Third Method
        System.out.println("Sum of Digits =\t"+third);
        //Store Method in Variable & Method Call
        long forth = AddlongTwoNumber.ForthAddLongNumberUsingMethod(635L, 756L);  //Forth Method
        System.out.println("Sum of Digits =\t"+forth);
    }
}

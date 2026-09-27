package shauryax.methodcallbyfile.add;

public class CallAddLongNumberUsingMethod {
    public static void main(String[] args) {
        //Create Object
        AddLongNumberUsingMethod AddLongTwoNumber = new AddLongNumberUsingMethod();
        //Method Call
        AddLongTwoNumber.FirstAddLongNumberUsingMethod();    //First Method
        //Method Call
        AddLongTwoNumber.SecondAddLongNumberUsingMethod(827L, 726L);    //Second Method
        //Store Method in Variable & Method Call
        Long third = AddLongTwoNumber.ThirdAddLongNumberUsingMethod();  //Third Method
        System.out.println("Sum of Digits =\t"+ third);
        //Store Method in Variable & Method Call
        Long forth = AddLongTwoNumber.ForthAddLongNumberUsingMethod(635L, 536L);  //Forth Method
        System.out.println("Sum of Digits =\t"+ forth);
    }
}

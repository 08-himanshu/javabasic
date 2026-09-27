package shauryax.methodcallbyfile.add;

public class CallAddIntTwoNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        AddIntTwoNumberUsingMethod AddIntTwoNumber = new AddIntTwoNumberUsingMethod();
        //Method Call
        AddIntTwoNumber.FirstAddIntNumberUsingMethod();    //First Method
        //Method Call
        AddIntTwoNumber.SecondAddIntNumberUsingMethod(827, 736);    //Second Method
        //Store Method in Variable & Method Call
        int third = AddIntTwoNumber.ThirdAddIntNumberUsingMethod();  //Third Method
        System.out.println("Sum of Digits =\t"+ third);
        int forth = AddIntTwoNumber.ForthAddIntNumberUsingMethod(736, 827);  //Forth Method
        System.out.println("Sum of Digits =\t"+ forth);
    }
}

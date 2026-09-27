package shauryax.methodcallbyfile.add;

public class CallAddIntegerTwoNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        AddIntegerTwoNumberUsingMethod AddIntegerTwoNumber = new AddIntegerTwoNumberUsingMethod();
        //Method Call
        AddIntegerTwoNumber.FirstAddIntegerNumberUsingMethod();    //First Method
        //Method Call
        AddIntegerTwoNumber.SecondAddIntegerNumberUsingMethod(634,738);    //Second Method
        //Store Method in Variable & Method Call
        Integer third = AddIntegerTwoNumber.ThirdAddIntNumberUsingMethod(); //Third Method
        System.out.println("Sum of Digits =\t"+ third);
        //Store Method in Variable & Method Call
        Integer forth = AddIntegerTwoNumber.ForthAddIntNumberUsingMethod(726, 928); //Forth Method
        System.out.println("Sum of Digits =\t"+ forth);
    }
}

package shauryax.methodcallbyfile.add;

public class CallAddFloatNumberUsingMethod {
    public static void main(String[] args) {

        //Create Object
        AddFloatNumberUsingMethod AddFloatTypeNumber = new AddFloatNumberUsingMethod();
        //Method Call
        AddFloatTypeNumber.FirstAddFloatTypeNumberUsingMethod();   //First Method
        //Method Call
        AddFloatTypeNumber.SecondAddFloatTypeNumberUsingMethod(827F, 726F);  //Second Method
        //Store Method in Variable & Method Call
        Float third = AddFloatTypeNumber.ThirdAddFloatTypeNumberUsingMethod();  //Third Method
        System.out.println("The Sum is\t"+ third);
        //Store Method in Variable & Method Call
        Float forth = AddFloatTypeNumber.ForthAddFloatTypeNumberUsingMethod(435F, 286F);  //Forth Method
        System.out.println("The Sum is\t"+ forth);

    }
}

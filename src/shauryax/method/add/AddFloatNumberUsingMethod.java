package shauryax.method.add;

public class AddFloatNumberUsingMethod {
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
    //First Method
    public void FirstAddFloatTypeNumberUsingMethod(){
        Float num1 = 345F;
        Float num2 = 827F;
        Float sum = num1 + num2;
        System.out.println("The Sum is\t" + sum);
    }
    //Second Method
    public void SecondAddFloatTypeNumberUsingMethod(Float firstNumber,Float secondNumber){
        Float num1 = firstNumber;
        Float num2 = secondNumber;
        Float sum = num1 + num2;
        System.out.println("The Sum is\t" + sum);
    }
    //Third Method
    public Float ThirdAddFloatTypeNumberUsingMethod() {
        Float num3 = 928F;
        Float num4 = 826F;
        Float sum = num3 + num4;
        return sum;
    }
    //Forth Method
    public Float ForthAddFloatTypeNumberUsingMethod(Float firstNumber,Float secondNumber) {
        Float num3 = firstNumber;
        Float num4 = secondNumber;
        Float sum = num3 + num4;
        return sum;
    }
}